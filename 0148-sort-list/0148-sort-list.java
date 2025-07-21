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
        if(head==null){
            return null;
        }
        List<Integer> list=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            list.add(curr.val);
            curr=curr.next;
        }
        Collections.sort(list);
        ListNode head1=new ListNode(list.get(0));
        ListNode curr1=head1;
        for(int i=1;i<list.size();i++){
            curr1.next=new ListNode(list.get(i));
            curr1=curr1.next;
        }
        return head1;
    }
}