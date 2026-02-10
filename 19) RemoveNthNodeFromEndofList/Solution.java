public class Solution {
//    private int listLength(ListNode head) {
//        int len = 1;
//        ListNode aux = new ListNode(head.val, head.next);
//
//        while (aux.next != null) {
//            aux = aux.next;
//            len++;
//        }
//
//        return len;
//    }

//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        int varListLength = listLength(head);
//    }

    public static void main(String[] args) {
        ListNode example = new ListNode(1);
        example.addElement(2);
        example.addElement(3);
        example.addElement(4);
        example.addElement(5);
        System.out.println(example);
    }
}