package dev.Mahathir;

import dev.Mahathir.Solutions.GetLongestSubsequence_2900;
import dev.Mahathir.Solutions.NumRabbits_781;
import dev.Mahathir.Solutions.PathSum_437;
import dev.Mahathir.HelperClasses.TreeNode;
import dev.Mahathir.Solutions.pushDominos_838;


public class Main {
    public static void main(String[] args) {
//        CountAndSay_38 countAndSay = new CountAndSay_38();
//        countAndSay.countAndSay(1);

//        CountFairPairs_2563  countFairPairs = new CountFairPairs_2563();
//        int[] nums = {0,1,7,4,4,5};
//        System.out.println( countFairPairs.countFairPairs(nums , 3, 6));

//        NumRabbits_781 numRabbits = new NumRabbits_781();
//        int[] nums = {0,0,1,1,1};
//        System.out.println( numRabbits.numRabbits(nums));

//        String s = ".L.R...LR..L..";
//        s="...";
//        pushDominos_838 p = new pushDominos_838();
//        p.pushDominoes(s);
//        minDominoRotations_1007 x = new minDominoRotations_1007();
//
//        x.minDominoRotations(new int []{3,5,1,2,3}, new int []{3,6,3,3,4});

        // Build the tree:
        //       10
        //      /  \
        //     5   -3
        //    / \    \
        //   3   2    11
        //  / \   \
        // 3  -2   1

//        TreeNode root = new TreeNode(10);
//        root.left = new TreeNode(5);
//        root.right = new TreeNode(-3);
//        root.left.left = new TreeNode(3);
//        root.left.right = new TreeNode(2);
//        root.right.right = new TreeNode(11);
//        root.left.left.left = new TreeNode(3);
//        root.left.left.right = new TreeNode(-2);
//        root.left.right.right = new TreeNode(1);
//
//        int targetSum = 8;
//
//        PathSum_437 solver = new PathSum_437();
//        int result = solver.pathSum(root, targetSum);

        GetLongestSubsequence_2900 getLongestSubsequence_2900 = new GetLongestSubsequence_2900();
        getLongestSubsequence_2900.getLongestSubsequence (new String[]{"d","a","v","b"}, new int[]{1,0,0,1});
    }
}
