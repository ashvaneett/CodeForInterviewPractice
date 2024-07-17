package BinaryTree;

public class Problems {

    static int maxx=Integer.MIN_VALUE;

    private static int sizeOf(BinaryTreeNode root){
        if(root==null){
            return 0;
        }
        else{
            return 1+sizeOf(root.left)+sizeOf(root.right);
        }
    }

    private static void maxInBinaryTree(BinaryTreeNode root){
        if(root==null){
            return;
        }
        maxx=Math.max(maxx, root.data);
        maxInBinaryTree(root.left);
        maxInBinaryTree(root.right);
    }
    public static void main(String[] args) {
        BinaryTreeNode root=new BinaryTreeNode(10);
        root.left=new BinaryTreeNode(100);
        root.right=new BinaryTreeNode(10045);
        root.left.right=new BinaryTreeNode(344);
        System.out.println(sizeOf(root));
        maxInBinaryTree(root);
        System.out.println(maxx);
    }
    
}
