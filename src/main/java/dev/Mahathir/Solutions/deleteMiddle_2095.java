package dev.mahathir.solutions;


 // Definition for singly-linked list.
   class ListNode {
     int val;
     ListNode next;

     ListNode() {
     }

     ListNode(int val) {
         this.val = val;
     }

     ListNode(int val, ListNode next) {
         this.val = val;
         this.next = next;
     }
 }

class deleteMiddle_2095 {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode predecessor = new ListNode(0, head);
        ListNode p1 = predecessor;
        ListNode p2 = head;

        while(p2 != null && p2.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        p1.next = p1.next.next;
        return predecessor.next;
        }
    }

