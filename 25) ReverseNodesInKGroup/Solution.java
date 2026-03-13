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
        ListNode beforeNode = new ListNode(0);
        beforeNode.next = head;
        ListNode firstNode = new ListNode(0);
        firstNode.next = head;
        ListNode secondNode = new ListNode(0);
        secondNode.next = head.next;
        ListNode afterNode = new ListNode(0);
        afterNode.next = head.next;

        while (secondNode != null) {

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
