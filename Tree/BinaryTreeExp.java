import java.util.*;
import java.util.Queue;

public class BinaryTreeExp {
    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){// this fuction will return the root node of the tree 
            idx++;
            if(nodes[idx]==-1){
                return null;
            }

            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
    }
    public static void preorder(Node root){//root-->left sub-tree -->right sub-tree 
        // time comp --O(n)
        if(root==null){
            System.out.print(-1+" ");
            return;
            // if you want to print -1 you want write 
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
        
    }

    public static void inorder(Node root){//left sub-tree --> root -->right sub-tree 
        if(root==null){
            // System.out.print(-1+" ");
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void postorder(Node root){//left sub-tree -->right sub-tree--> root
        if(root==null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    
    public static void levelOrder(Node root) {// this will print all nodes in level order 
        if (root == null) {
            return;
        }
    
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
    
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println(); // Move this outside the else block
                if (!q.isEmpty()) {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);

        //System.out.println(root.data);

        // preorder(root);
        // inorder(root);
        // postorder(root);
        levelOrder(root);
    }
}
