/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> mylist = new ArrayList<Integer>();
        ListNode runner = head;
        while(runner != null){
            mylist.add(runner.val);
            runner = runner.next;
        }
        runner = head;
        Collections.sort(mylist);
        for(int i=0;i<mylist.size();i++){
            runner.val = mylist.get(i);
            runner = runner.next;
        }
        return head;
    }
}
