package dev.Mahathir.Solutions;
import java.util.Stack;

public class GoodNodes_1448 {
    int goodNode=0;
    public int goodNodes(TreeNode root) {
        if(root==null) return 0;
        dfs(root, root.val);
        return goodNode;
    }

    void dfs(TreeNode root, int maxInStk){
        if(root==null) return;
        if(root.val >= maxInStk ){
            goodNode++;
            maxInStk = root.val;
        }
        dfs(root.left, maxInStk);
        dfs(root.right, maxInStk);
    }
}
