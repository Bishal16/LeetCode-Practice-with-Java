package dev.Mahathir.Solutions;
import dev.Mahathir.HelperClasses.TreeNode;

public class LongestZigzag_1372 {
    int mx = 0;
    public int longestZigZag(TreeNode root) {
        dfs(root);
        return mx;
    }
    public int findZigzag(TreeNode node, String move, int cnt) {
        if (node == null) return cnt;

        cnt++;
        if (move.equals("right"))
            return findZigzag(node.right, "left", cnt);
        else
            return findZigzag(node.left, "right", cnt);
    }

    void dfs(TreeNode root){
        if(root == null)
            return ;

        int zigzagLn = findZigzag(root, "left", 0);
        if(zigzagLn > mx)
            mx = zigzagLn;

        zigzagLn = findZigzag(root, "right", 0);
        if(zigzagLn > mx)
            mx = zigzagLn;

        dfs(root.left);
        dfs(root.right);
    }
}