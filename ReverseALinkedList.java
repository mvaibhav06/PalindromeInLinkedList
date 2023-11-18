package stack;

import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class ReverseALinkedList {
        public boolean isPalindrome(ListNode head) {
            ArrayList<Integer> input = new ArrayList<>();
            ListNode current = head;

            while(current!=null){
                input.add(current.val);
                current = current.next;
            }

            int i=0;
            int j = input.size()-1;

            while(i<j){
                if(input.get(i)==input.get(j)){
                    i++;
                    j--;
                }else{
                    return false;
                }
            }
            return true;
        }

}
