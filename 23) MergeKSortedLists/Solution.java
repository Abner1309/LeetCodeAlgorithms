import java.util.*;

public class Solution {
  private int linkedListLength(ListNode head) {
    int answer = 0;
    ListNode aux = head;

    while (aux != null) {
      aux = aux.next;
      answer++;
    }

    return answer;
  }
  
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    int len1 = linkedListLength(list1);
    int len2 = linkedListLength(list2);
    if (len1 == 0 && len2 == 0) return null;

    ListNode answer = new ListNode();
    ListNode answerPointer = answer;
    for (int i = 1; i < len1 + len2; i++) {
      answerPointer.next = new ListNode();
      answerPointer = answerPointer.next;
    }

    ListNode pointer1 = list1;
    ListNode pointer2 = list2;
    answerPointer = answer;
    while (pointer1 != null || pointer2 != null) {
      if (pointer1 == null) {
        answerPointer.val = pointer2.val;
        answerPointer = answerPointer.next;
        pointer2 = pointer2.next;
      }
      else if (pointer2 == null) {
        answerPointer.val = pointer1.val;
        answerPointer = answerPointer.next;
        pointer1 = pointer1.next;
      }
      else if (pointer1.val < pointer2.val) {
        answerPointer.val = pointer1.val;
        answerPointer = answerPointer.next;
        pointer1 = pointer1.next;
      }
      else {
        answerPointer.val = pointer2.val;
        answerPointer = answerPointer.next;
        pointer2 = pointer2.next;
      }
    }

    return answer;
  }
  
  public ListNode mergeKLists(ListNode[] lists) {
    ListNode[] answer = lists;
    int qtdLists = lists.length;
  
    if (qtdLists == 0) {
      return null;
    }
    else if (qtdLists == 1) {
      return lists[0];
    }
    else {
      int i = 0, j = 1;
      while (j < qtdLists) {
        ListNode aux1 = answer[i];
        ListNode aux2 = answer[j];
        answer[i] = mergeTwoLists(aux1, aux2);
        i = i + 2;
        j = j + 2;
      }
    }
    
    return answer[0];
  }
  
  public static void main (String[] args) {
    // code
  }
}
