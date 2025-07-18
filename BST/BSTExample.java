package BST;

import java.util.ArrayList;

public class BSTExample {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int val) {
        if (root.data < val) {
            root.right = delete(root.right, val);
        }

        else if (root.data > val) {
            root.left = delete(root.left, val);
        }

        else {
            // case - 1 leaf node
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 - single child
            if (root.right == null) {
                return root.left;
            } else if (root.left == null) {
                return root.right;
            }

            // case 3 - both child
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }

        if (k1 <= root.data && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRange(root.left, k1, k2);
        } else {
            printInRange(root.right, k1, k2);
        }
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }

    public static void printRootToLeaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.data);

        if (root.left == null && root.right == null) {
            printPath(path);
        }

        printRootToLeaf(root.left, path);
        printRootToLeaf(root.right, path);
        path.remove(path.size() - 1);
    }

    public static boolean isValidBST(Node root, Node min, Node max) {

        if (root == null) {
            return true;
        }

        if (min != null && root.data <= min.data) {
            return false;
        }

        else if (max != null && root.data >= max.data) {
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);

    }

    public static Node createMirror(Node root) {

        if (root == null) {
            return null;
        }

        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }

    public static Node createBST(int arr[], int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, start, mid - 1);
        root.right = createBST(arr, mid + 1, end);

        return root;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }

        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node createBST2(ArrayList<Integer> inorder, int st, int end) {
        if (st > end) {
            return null;
        }

        int mid = (st + end) / 2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST2(inorder, st, mid - 1);
        root.right = createBST2(inorder, mid + 1, end);

        return root;
    }

    public static Node balanceBST(Node root) {

        // inorder seq
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);

        // sorted inorder -> balance BST
        root = createBST2(inorder, 0, inorder.size() - 1);

        return root;
    }

    static class Info {
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int maxBST = 0;

    public static Info largestBST(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info leftInfo = largestBST(root.left);
        Info rigthInfo = largestBST(root.right);
        int size = leftInfo.size + rigthInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rigthInfo.min));
        int max = Math.min(root.data, Math.min(leftInfo.max, rigthInfo.max));

        if (root.data <= leftInfo.max || root.data >= rigthInfo.min) {
            return new Info(false, size, min, max);
        }

        if (leftInfo.isBST && rigthInfo.isBST) {
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, min, max);
        }

        return new Info(false, size, min, max);
    }

    public static Node mergeBST(Node root1, Node root2) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        int i = 0, j = 0;
        ArrayList<Integer> finaArrayList = new ArrayList<>();

        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                finaArrayList.add(arr1.get(i));
                i++;
            } else {
                finaArrayList.add(arr2.get(j));
                j++;
            }
        }

        while (i < arr1.size()) {
            finaArrayList.add(arr1.get(i));
            i++;
        }

        while (j < arr2.size()) {
            finaArrayList.add(arr2.get(j));
            j++;
        }

        return createBST2(finaArrayList, 0, finaArrayList.size() - 1);
    }

    public static void main(String args[]) {
        // int values[] = { 1, 1, 1 };
        // Node root = null;

        // for (int i = 0; i < values.length; i++) {
        // root = insert(root, values[i]);
        // }

        // inOrder(root);
        // System.out.println();

        // if (search(root, 6)) {
        // System.out.println("found");
        // } else {
        // System.out.println("not found");
        // }

        // printInRange(root, 5, 12);
        // printRootToLeaf(root, new ArrayList<>());

        // System.out.println(isValidBST(root, null, null));

        // Node root = new Node(8);
        // root.left = new Node(5);
        // root.right = new Node(10);
        // root.left.left = new Node(3);
        // root.left.right = new Node(6);
        // root.right.right = new Node(11);

        // root = createMirror(root);
        // preorder(root);

        // int arr[] = { 3, 5, 6, 8, 10, 11, 12 };
        // int start = 0;
        // int end = arr.length - 1;

        // Node root = createBST(arr, start, end);
        // preorder(root);

        // Node root = new Node(8);
        // root.left = new Node(6);
        // root.left.left = new Node(5);
        // root.left.left.left = new Node(3);

        // root.right = new Node(10);
        // root.right.right = new Node(11);
        // root.right.right.right = new Node(12);

        // root = balanceBST(root);
        // preorder(root);

        // Node root = new Node(50);
        // root.left = new Node(30);
        // root.left.left = new Node(5);
        // root.left.left.left = new Node(20);

        // root.right = new Node(60);
        // root.right.left = new Node(45);
        // root.right.right = new Node(70);
        // root.right.right.left = new Node(65);
        // root.right.right.right = new Node(80);

        // largestBST(root);
        // System.out.println("Largest BST size = " + maxBST);

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBST(root1, root2);
        preorder(root);
    }
}
