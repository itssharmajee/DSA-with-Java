import java.util.*;
import java.util.Queue;

public class BinaryTreeExp {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        // Function to build the tree using the given array of nodes
        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    // Function to perform preorder traversal (root --> left sub-tree --> right sub-tree)
    public static void preorder(Node root) {
        if (root == null) {
            //System.out.print(-1 + " "); // Print -1 for null nodes
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Function to perform inorder traversal (left sub-tree --> root --> right sub-tree)
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Function to perform postorder traversal (left sub-tree --> right sub-tree --> root)
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // Function to perform level order traversal of the binary tree
    public static void levelOrder(Node root) {
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

    // Function to count the total number of nodes in the binary tree
    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);
        return leftNodes + rightNodes + 1;
    }

    // function to find out the sum of all nodes data
    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }

        if(root.data==-1){
            return 0;
        }
        int leftNodesData=sumOfNodes(root.left);
        int rightNodesData=sumOfNodes(root.right);
        return leftNodesData+rightNodesData+root.data;

    }

    //function to find out height of the tree 

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftSubTreeHeight=height(root.left);
        int rightSubTreeHeight=height(root.right);
        return Math.max(leftSubTreeHeight, rightSubTreeHeight)+1;
    }

    public static void main(String[] args) {
        int nodes[] ={1,  2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        // Uncomment the method calls below to see different traversals and counts
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelOrder(root);

        // int totalNoOfNodes = countNodes(root);
        // System.out.println("Total number of nodes: " + totalNoOfNodes);

    //     System.out.println(sumOfNodes(root));
        // System.out.println(height(root));
    }
}
