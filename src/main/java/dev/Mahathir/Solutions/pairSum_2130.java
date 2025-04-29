package dev.mahathir.solutions;

import java.util.ArrayList;

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
    public int pairSum_2130(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();

        while(head != null){
            arr.add(head.val);
            head = head.next;
        }
        int max = 0, n = arr.size();
        for(int i = 0; i < n/2; i++){
            if(arr.get(i)+arr.get(n-1-i) > max)
                max = arr.get(i)+arr.get(n-1-i);
        }
        return max;
    }
}