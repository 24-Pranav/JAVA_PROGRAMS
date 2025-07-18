public class LLGroupReverse {

    public static class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public static Node reverseKGroup(Node head, int k) {
        Node curr = head;
        Node prev = null;
        Node finalhead = null;
        Node temp = null;
        int size = 0;

        while (head != null) {
            while (curr != null && size < k) {
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                size++;
            }

            if (finalhead == null) {
                finalhead = prev;
            }

            if (temp != null) {
                temp.next = prev;
            }

            temp = head;
            prev = null;
            head = curr;
            size = 0;
        }
        return finalhead;
    }

    static Node addTwoLists(Node num1, Node num2) {
        // code here
        Node l1 = reverseList(num1);
        Node l2 = reverseList(num2);
        Node curr = null;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int v1 = l1 != null ? l1.data : 0;
            int v2 = l2 != null ? l2.data : 0;
            int sum = v1 + v2 + carry;
            carry = sum / 10;
            Node tmp = new Node(sum % 10);
            tmp.next = curr;
            curr = tmp;
            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }
        while (curr != null && curr.data == 0) {
            curr = curr.next;
        }

        return curr;

    }

    static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void main(String args[]) {
        LLGroupReverse ll = new LLGroupReverse();

    }
}
