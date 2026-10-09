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
    public ListNode partition(ListNode head, int x) {
        ListNode lowerhead = new ListNode(-1);
        ListNode lowertail=lowerhead;

        ListNode largehead = new ListNode(-1);
        ListNode largetail=largehead;

          ListNode temp=head;

         while(temp!=null){
            if(temp.val<x){
                ListNode insert =temp;
                temp=temp.next;
                insert.next=null;
                lowertail.next=insert;
                lowertail=insert;
            }
            else{
                ListNode insert =temp;
                temp=temp.next;
                insert.next=null;
                largetail.next=insert;
                largetail=insert;
            }
         }
         lowertail.next=largehead.next;
         largetail.next=null;

         lowerhead=lowerhead.next;

          return lowerhead;

    }
}