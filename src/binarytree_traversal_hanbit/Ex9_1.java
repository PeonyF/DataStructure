package binarytree_traversal_hanbit;

public class Ex9_1 {
    public static void main(String[] args){
        LinkedTree linkedTree = new LinkedTree();
        TreeNode node7 = linkedTree.makeBinaryTree(null,'D',null);
        TreeNode node6 = linkedTree.makeBinaryTree(null,'c',null);
        TreeNode node5 = linkedTree.makeBinaryTree(null,'B',null);
        TreeNode node4 = linkedTree.makeBinaryTree(null,'A',null);
        TreeNode node3 = linkedTree.makeBinaryTree(node6,'/',node7);
        TreeNode node2 = linkedTree.makeBinaryTree(node4,'*',node5);
        TreeNode node1 = linkedTree.makeBinaryTree(node2,'-',node3);

        System.out.printf("\n PreOrder : ");
        linkedTree.preOrder(node1);

        System.out.printf("\n InOrder : ");
        linkedTree.inOrder(node1);

        System.out.printf("\n PostOrder : ");
        linkedTree.postOrder(node1);

    }
}
