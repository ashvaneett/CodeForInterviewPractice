package BinaryTree;


class BinaryTreeNode{
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class BinaryTree {

    private static void preOrderTrav(BinaryTreeNode root){
        if(root==null) return;
        System.out.println(root.data);
        preOrderTrav(root.left);
        preOrderTrav(root.right);
    }

    private static void postOrderTrav(BinaryTreeNode root){
        if(root==null) return;
        preOrderTrav(root.left);
        preOrderTrav(root.right);
        System.out.println(root.data);
    }
    private static void inOrderTrav(BinaryTreeNode root){
        if(root==null) return;
        preOrderTrav(root.left);
        System.out.println(root.data);
        preOrderTrav(root.right);
    }

    public static void main(String[] args) {
        BinaryTreeNode root=new BinaryTreeNode(10);
        root.left=new BinaryTreeNode(100);
        root.right=new BinaryTreeNode(10045);
        root.left.right=new BinaryTreeNode(344);
        //preOrderTrav(root);
        //postOrderTrav(root);
        inOrderTrav(root);
        
    }
    
}
