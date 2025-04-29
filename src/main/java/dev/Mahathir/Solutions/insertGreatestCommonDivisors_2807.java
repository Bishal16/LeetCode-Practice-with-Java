package dev.mahathir.solutions;

import java.util.ArrayList;
// public class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  }
public class insertGreatestCommonDivisors_2807 {
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        ListNode head1 = head;
        while(head1.next != null){
            int gcd = GCD(head1.val, head1.next.val);
            ListNode gcdNode = new ListNode(gcd);

            gcdNode.next = head1.next;
            head1.next = gcdNode;
            head1 = gcdNode.next;
        }
        return head;
    }
    int GCD(int a, int b){
        while(b !=0){
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}