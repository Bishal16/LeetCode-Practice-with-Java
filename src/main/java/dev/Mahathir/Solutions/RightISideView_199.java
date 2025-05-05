package dev.Mahathir.Solutions;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// * Definition for a binary tree node.
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class RightSideView_199 {
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return null;
        List<Integer> ans = new ArrayList<Integer>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        ans.add(root.val);

        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<Integer>();
            int levelSize = q.size();
            for(int i= 0; i <levelSize; i++) {
                TreeNode node = q.poll();
                if (node.left != null){
                    q.add(node.left);
                    level.add(node.left.val);
                }
                if(node.right != null) {
                    q.add(node.right);
                    level.add(node.right.val);
                }
            }
            System.out.println(level);
            ans.add(level.get(level.size()-1));
        }
        return ans ;
    }
}