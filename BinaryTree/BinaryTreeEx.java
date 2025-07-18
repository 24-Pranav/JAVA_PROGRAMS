package BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import BinaryTree.BinaryTreeEx.Node.BinaryTree;

public class BinaryTreeEx {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        static class BinaryTree {
            static int idx = -1;

            public static Node buildTree(int nodes[]) {
                idx++;
                if (nodes[idx] == -1) {
                    return null;
                }

                Node newNode = new Node(nodes[idx]);
                newNode.left = buildTree(nodes);
                newNode.right = buildTree(nodes);
                return newNode;
            }

            public static void preorder(Node root) {
                if (root == null) {
                    return;
                }
                System.err.print(root.data + " ");
                preorder(root.left);
                preorder(root.right);
            }

            public static void postorder(Node root) {
                if (root == null) {
                    return;
                }

                postorder(root.left);
                postorder(root.right);
                System.err.print(root.data + " ");
            }

            public static void levelOrder(Node root) {

                if (root == null) {
                    return;
                }

                Queue<Node> q = new LinkedList<>();
                q.add(root);
                q.add(null);

                while (!q.isEmpty()) {
                    Node currNode = q.remove();

                    if (currNode == null) {
                        System.err.println();

                        if (q.isEmpty()) {
                            break;
                        } else {
                            q.add(null);
                        }
                    } else {
                        System.err.print(currNode.data + " ");
                        if (currNode.left != null) {
                            q.add(currNode.left);
                        }
                        if (currNode.right != null) {
                            q.add(currNode.right);
                        }
                    }
                }
            }
        }

    }

    public static int treeHeight(Node root) {

        if (root == null) {
            return 0;
        }

        int lh = treeHeight(root.left);
        int rh = treeHeight(root.right);

        return Math.max(lh, rh) + 1;

    }

    public static int countNodes(Node root) {

        if (root == null) {
            return 0;
        }

        int lh = countNodes(root.left);
        int rh = countNodes(root.right);
        return lh + rh + 1;
    }

    public static int diameter(Node root) {

        if (root == null) {
            return 0;
        }

        int ldia = diameter(root.left);
        int lh = treeHeight(root.left);
        int rdia = treeHeight(root.right);
        int rh = treeHeight(root.right);

        int selfDia = lh + rh + 1;
        return Math.max(selfDia, Math.max(ldia, rdia));
    }

    public static boolean isIdentical(Node node, Node subRoot) {
        if (node == null && subRoot == null) {
            return true;
        } else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }
        if (!isIdentical(node.left, subRoot.left)) {
            return false;
        }
        if (!isIdentical(node.right, subRoot.right)) {
            return false;
        }

        return true;
    }

    public static boolean isSubtree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }

        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    static class Info {

        Node root;
        int hd;

        public Info(Node root, int hd) {
            this.root = root;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {

        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;

        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.root);
                }
                if (curr.root.left != null) {
                    q.add(new Info(curr.root.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                if (curr.root.right != null) {
                    q.add(new Info(curr.root.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }

    public static void KLevel(Node root, int level, int k) {

        if (root == null) {
            return;
        }

        if (level == k) {
            System.err.print(root.data + " ");
            return;
        }

        KLevel(root.left, level + 1, k);
        KLevel(root.right, level + 1, k);
    }

    public static boolean getPath(Node root, int n, ArrayList<Node> path) {

        if (root == null) {
            return false;
        }

        path.add(root);

        if (root.data == n) {
            return true;
        }

        boolean foundleft = getPath(root.left, n, path);
        boolean foundright = getPath(root.right, n, path);

        if (foundleft || foundright) {
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2) {

        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i = 0;

        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }

        return path1.get(i - 1);
    }

    public static Node lca2(Node root, int n1, int n2) {

        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        if (leftLca == null) {
            return rightLca;
        }

        if (rightLca == null) {
            return leftLca;
        }

        return root;
    }

    public static int lcaDist(Node root, int n) {

        if (root == null) {
            return -1;
        }

        if (root.data == n) {
            return 0;
        }

        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        } else if (leftDist == -1) {
            return rightDist + 1;
        } else {
            return leftDist + 1;
        }
    }

    public static int minDist(Node root, int n1, int n2) {

        Node lca = lca2(root, n1, n2);

        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);

        return dist1 + dist2;
    }

    public static int kAncestors(Node root, int n, int k) {

        if (root == null) {
            return -1;
        }

        if (root.data == n) {
            return 0;
        }

        int leftNode = kAncestors(root.left, n, k);
        int rightNode = kAncestors(root.right, n, k);

        if (leftNode == -1 && rightNode == -1) {
            return -1;
        }
        int max = Math.max(leftNode, rightNode);

        if (max + 1 == k) {
            System.out.println(root.data);
        }

        return max + 1;
    }

    public static int transform(Node root) {

        if (root == null) {
            return 0;
        }

        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data;

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        root.data = newLeft + leftChild + newRight + rightChild;

        return data;
    }

    public static void preorder(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        // int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // BinaryTree tree = new BinaryTree();
        // Node root = tree.buildTree(nodes);
        // tree.levelOrder(root);

        // Tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // int n1 = 4, n2 = 5;
        // int k = 3;
        // SubTree
        // Node subRoot = new Node(2);
        // subRoot.left = new Node(4);
        // subRoot.right = new Node(5);

        // KLevel(root, 1, k);

        // System.out.println(lca2(root, n1, n2).data);

        // System.out.println(minDist(root, n1, n2));

        // int n = 4, k = 1;

        // System.out.println(kAncestors(root, n, k));

        transform(root);
        preorder(root);
    }
}
