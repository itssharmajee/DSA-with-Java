package BST;
public class BinarySearchTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }
    // this function will simply insert the node in BST
    public static Node insert(Node root,int val){
        if(root == null){
            root=new Node(val);
            return root;
        }

        if(root.data>val){
            root.left=insert(root.left, val);
        }else{
            root.right=insert(root.right, val);
        }
        return root;

    }
    //As you know if you print BST in inorder traversal it will print all the nodes in order
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.err.print(root.data+ " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};

        Node root = null;
        for(int i=0; i<values.length; i++){
            root=insert(root, values[i]);
        }

        inorder(root);
    }

    
}
