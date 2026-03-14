public class Solution {
    private static boolean verifyQuantity(ListNode head, int k) {
        ListNode aux = head;
        int i;
        for (i = 1; i < k && aux != null; i++) {
            aux = aux.next;
        }
        return i == k;
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head.next == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode auxiliary1 = dummy;
        ListNode firstNode = head;
        ListNode secondNode = head;
        ListNode auxiliary2 = head;

        while (verifyQuantity(firstNode, k)) {
            for (int j = 0; j < Math.floorDiv(k, 2); j++) {
                for (int z = 1; z < k - 2 * j; z++) {
                    secondNode = secondNode.next;
                    if (z != 1) { auxiliary2 = auxiliary2.next; }
                }

                ListNode temporary = firstNode.next;
                firstNode.next = secondNode.next;
                secondNode.next = temporary;
                auxiliary1.next = secondNode;
                auxiliary2.next = firstNode;

                firstNode = auxiliary1.next.next;
                auxiliary1 = auxiliary1.next;
                auxiliary2 = firstNode;
                secondNode = firstNode;
            }
            for (int x = 0; x < Math.floorDiv(k, 2) + 1 && firstNode.next != null; x++) {
                auxiliary1 = auxiliary1.next;
                firstNode = firstNode.next;
            }
            auxiliary2 = firstNode;
            secondNode = firstNode;
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
