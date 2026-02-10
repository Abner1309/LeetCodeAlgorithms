public class ListNode {
    int val;
    ListNode next = null;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void addElement(int element) {
        ListNode current = this;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new ListNode(element);
    }

    @Override
    public String toString() {
        StringBuilder answer = new StringBuilder();

        ListNode current = this;
        while (current != null) {
            answer.append(current.val).append(" -> ");
            current = current.next;
        }
        answer.append("NULL");

        return answer.toString();
    }
}
