public class HeightOfTree {
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

    static class BinaryTreeConstruction {
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

    public static int height(Node root) {// this function will return the height of tree
        if (root == null) {
            return 0;
        }
        int leftSubTreeHeight = height(root.left);
        int rightSubTreeHeight = height(root.right);
        return Math.max(leftSubTreeHeight, rightSubTreeHeight) + 1;
    }

    public static int diameter(Node root) {// this fuction will return the diameter of the tree
        // Time complexity of this function is O(n^2)
        // this function is not fully optimized it can be optimized in linear this
        // complexity

        if (root == null) {
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;

        return Math.max(diam3, Math.max(diam2, diam1));
    }

    // Optimized linear time complexity O(n)

    static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter2(Node root) {
        if(root == null){
            return new TreeInfo(0,0);
        }

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;

        int dia1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int mydiam=Math.max(Math.max(diam2, diam2),diam3);

        TreeInfo myInfo = new TreeInfo(myHeight, mydiam);
        return myInfo;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTreeConstruction tree = new BinaryTreeConstruction();
        Node root = tree.buildTree(nodes);

        // System.out.println(height(root));

        // int diaMeter = diameter(root);
        // System.out.println(diaMeter);

        System.out.println(diameter2(root).diam);
    }

}
