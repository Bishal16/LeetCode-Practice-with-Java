package dev.Mahathir.Solutions;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilar_872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf1 = new ArrayList<>();
        List<Integer> leaf2 = new ArrayList<>();

        dfs(root1, leaf1);
        dfs(root2, leaf2);
        return leaf1.equals(leaf2);
    }
    void dfs(TreeNode root, List<Integer> leaf){
        if(root.left == null && root.right == null) leaf.add(root.val);
        if(root.left != null) dfs(root.left, leaf);
        if(root.right != null) dfs(root.right, leaf);
    }
}