public class Solution {
    private static boolean verifyQuantity(ListNode head, int k) {
        ListNode aux = head;
        int i;
        for (i = 0; i < k && aux != null; i++) {
            aux = aux.next;
        }
        return i == k;
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head.next == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode actualGroup = new ListNode(0);
        actualGroup.next = head;
        ListNode nextGroup = new ListNode(0);
        nextGroup.next = head;

        ListNode auxiliary1 = dummy;
        ListNode firstNode = head;
        ListNode secondNode = head;
        ListNode auxiliary2 = head;

        int i = 1;
        while (verifyQuantity(firstNode, k)) {
            while (firstNode != secondNode) {
                for (i = i + 1; i < k; i++) {
                    secondNode = secondNode.next;
                    if (i != 1) {
                        auxiliary2 = auxiliary2.next;
                    }
                }

                ListNode temporary = firstNode.next;
                firstNode.next = secondNode.next;
                secondNode.next = temporary;
                auxiliary1.next = secondNode;
                auxiliary2.next = firstNode;

                auxiliary1 = auxiliary1.next;
                firstNode = firstNode.next;
                secondNode = firstNode;
                auxiliary2 = firstNode;
            }
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        ListNode g = new ListNode(7);
        ListNode h = new ListNode(8);
        ListNode i = new ListNode(9);
        ListNode j = new ListNode(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;

        System.out.println("Original List:");
        ListNode aux = a;
        while (aux != null) {
            System.out.print(aux.val + " -> ");
            aux = aux.next;
        }

        System.out.print("\n\n");

        System.out.println("Modified List:");
        aux = reverseKGroup(a, 5);
        while (aux != null) {
            System.out.print(aux.val + " -> ");
            aux = aux.next;
        }
    }
}
