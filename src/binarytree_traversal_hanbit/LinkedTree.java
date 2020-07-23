package binarytree_traversal_hanbit;

public class LinkedTree {
    private TreeNode root;

    public TreeNode makeBinaryTree(TreeNode binaryTree1, Object data, TreeNode binaryTree2) {
        TreeNode root = new TreeNode();
        root.data = data;
        root.left = binaryTree1;
        root.right = binaryTree2;
        return root;
    }

    public void preOrder(TreeNode root){
        if(root != null){
            System.out.printf("%c", root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void inOrder(TreeNode root){
        if(root != null){
            inOrder(root.left);
            System.out.printf("%c", root.data);
            inOrder(root.right);
        }
    }

    public void postOrder(TreeNode root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.printf("%c", root.data);
        }
    }
}
