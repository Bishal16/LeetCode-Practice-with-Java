package dev.Mahathir.Solutions;

public class deleteNode_450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return root;
        }

        if(key < root.val) root.left = deleteNode(root.left, key);
        else if(key > root.val) root.right = deleteNode(root.right, key);
        else{
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;
            // node must have two child, so we follow in-oder or preorder or post-order
            TreeNode rightMinNode = minFromRightSubTree(root.right);
            root.val = rightMinNode.val;
            root.right = deleteNode(root.right, rightMinNode.val);
        }

        return root;
    }
    TreeNode minFromRightSubTree(TreeNode node){
        while(node.left != null){
            node = node.left;
        }
        return node;
    }
}
