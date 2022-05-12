public class Main {
    public static void main(String[] args) {
        //create a bin_tree object
        BST bin_tree = new BST();
        bin_tree.insert(30);
        bin_tree.insert(15);
        bin_tree.insert(3);
        bin_tree.insert(18);
        bin_tree.insert(89);
        bin_tree.insert(72);
        //print the bin_tree
        System.out.println("The bin_tree Created In Order:");
        bin_tree.inorder();
        System.out.println("\nTree Reorganization: bin_tree after deleting 89: ");
        bin_tree.delete(89);
        bin_tree.inorder();
        System.out.println("\nTree Reorganization: bin_tree after deleting 15:");
        bin_tree.delete(15);
        bin_tree.inorder();
        // Finding Element
        boolean search_element = bin_tree.find_element(30);
        System.out.println("\nNumber 30 found in bin_tree:" + search_element);
        search_element = bin_tree.find_element(12);
        System.out.println("\nNumber 12 found in bin_tree:" + search_element);
        bin_tree.root = new Node(30);
        bin_tree.root.left = new Node(15);
        bin_tree.root.right = new Node(89);
        bin_tree.root.left.left = new Node(3);
        bin_tree.root.left.right = new Node(18);
        bin_tree.root.right.left = new Node(72);
        //Inorder Traversal
        System.out.println("\nIn Order Traversal: ");
        bin_tree.inorder();
        //PostOrder Traversal
        System.out.println("\nPostOrder Traversal:");
        bin_tree.postTraversal();
        //PreOrder Traversal
        System.out.println("\nPreOrder Traversal:");
        bin_tree.preorder_traversal();
        // Largest element in the tree
        Node maxNode = bin_tree.max();
        System.out.println("\nLargest Element in bin_tree: " + maxNode.value);
        // Smallest Element in the Tree
        Node minNode = bin_tree.minimum();
        System.out.println("\nSmallest Element in bin_tree: " + minNode.value);
        // Height of the tree
        bin_tree.bst_height(bin_tree.root);
        // Breadth First Search
        System.out.println("\nBreadth First Search: ");
        bin_tree.breadth_first();
        System.out.println("\n");
        // Nth largest element
        for (int nth = 1;
             nth <= 10; nth++) {
            bin_tree.nlargest_caller(nth);
        }
    }
}