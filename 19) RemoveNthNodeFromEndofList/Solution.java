public class Solution {
    private int listLength(ListNode head) {
        int len = 0;
        ListNode aux = head;

        while (aux != null) {
            len++;
            aux = aux.next;
        }

        return len;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int varListLength = listLength(head);
        int jumps = varListLength - n;

        if (varListLength == 1) {return head = null;}

        if (jumps == 0) {
            ListNode aux1 = head;
            ListNode aux2 = head.next;

            aux1.next = null;
            head = aux2;

            return head;
        }

        ListNode aux1 = head;
        ListNode aux2 = head.next;
        for (int i = 1; i < jumps; i++) {
            aux1 = aux1.next;
            aux2 = aux2.next;
        }
        aux1.next = aux1.next.next;
        aux2.next = null;

        return head;
    }

    public static void main(String[] args) {
        // Pass
    }
}