package BST;


public class BinarySearchTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // this function will simply insert the node in BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;

    }

    // As you know if you print BST in inorder traversal it will print all the nodes
    // in order
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.err.print(root.data + " ");
        inorder(root.right);
    }

    // this function returns true if key is present else return false

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    // this function will delete a node from given val
    public static Node delete(Node root, int val) {
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            // case 1 val has no node (leaf node )
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2 val has single node
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 val has both nodes(left and right )

            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        // int values[] = {5,1,3,4,2,7};

        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };

        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();
        // System.out.println( search(root, 4));
        root = delete(root, 8);
        // System.out.println(root.data);// this point i have an issue
        inorder(root);

    }

}
