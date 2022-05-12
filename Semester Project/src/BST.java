import java.util.LinkedList;
import java.util.Queue;

public class BST {
    // Creating the Binary Search tree's root Node
    Node root;

    // Using a Constructor to make an empty Binary Search Tree
    // Will use the insert function below to add values to the BST
    BST() {
        root = null;
    }

    // Function to insert nodes for the BST
    // Uses an integer parameter (int value) to give the node a value
    // Function has two parts: the wrapper function and its recursive function
    // Wrapper Function: a method which calls on to another method
    // All recursive functions in this class has its respective wrapper method

    void insert(int value) {
        root = insert_rec(root, value);
    }
    //Insert Function written Recursively
    Node insert_rec(Node root, int value) {
        // Tree is currently empty
        if (root == null) {
            // Assigning the first Node entered as the root
            // If it isn't intended as root, the function traverses below
            root = new Node(value);
            return root;}
        if (value < root.value)
            // If value is less than the root, it goes as the left child
            root.left = insert_rec(root.left, value);
        else if (value > root.value)
            // If value is greater than the root, it goes as the right child
            root.right = insert_rec(root.right, value);
        return root;
    }

    // Wrapper Method to Call onto its recursive method
    void delete(int value) {
        root = recursive_d(root, value);
    }

    //Delete Function written recursively
    // Uses two parameters: root and value. The value is an integer value that refers to its respective node
    Node recursive_d(Node root, int value) {
        // Assumes an empty tree
        if (root == null)
            return root;
        if (value < root.value)
            //If value given is less than root, check the left child
            root.left = recursive_d(root.left, value);
        else if (value > root.value)
            // If value given is greater than root, check the right child
            root.right = recursive_d(root.right, value);
        else {
            // Else statement for node only containing one child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            // When node has two children take the right child
            root.value = sm_element(root.right);
            root.right = recursive_d(root.right, root.value);
        }
        return root;
    }
    public int sm_element(Node root) {
        //The smallest initial value is the root (it's the first and only value)
        int min = root.value;
        // Algo to find min
        while (root.left != null) {
            // Smaller values always go left
            min = root.left.value;
            root = root.left;
        }
        return min;
    }
    // method for inorder traversal of BST
    // Wrapper Method present
    void inorder() {
        inorder_rec(root);
    }
    // Recursive function for In Order Traversal
    void inorder_rec(Node root) {
        if (root != null) {
            inorder_rec(root.left);
            System.out.print(root.value + " ");
            inorder_rec(root.right);
        }
    }
    // Wrapper Function
    // Using a boolean as true/false to find element
    boolean find_element(int value) {
        root = find_rec(root, value);
        return root != null;}
    //recursive function to find element
    Node find_rec(Node root, int value) {
        // Either root is null or value of the value is the root
        if (root == null || root.value == value)
            // Return root if the value of the value is equal to the root
            return root;
        // Searching down the right subtree of BST if value > root
        if (root.value > value)
            return find_rec(root.left, value);
        return find_rec(root.right, value);
    }
    public Node max() {
        if (root == null) {
            return null;
            // There cannot be a max if there is no root Node
        }
        Node x = root;
        // Created a node X that is assigned to the root node
        // Searching down the right subtree of the root to find max
        while (x.right != null) {
            // As long as the child of it's parent doesn't produce a null node, it keeps
            // searching down the pattern of right child
            x = x.right;
        }
        return x;
    }
    //function to find the min data value in the tree.
    public Node minimum() {
        if (root == null) {
            return null;
        }
        Node y = root;
        // Created a node y that is assigned to the root node
        // Searching down the left subtree of the root to find min
        while (y.left != null) {
            y = y.left;
            // As long as the child of it's parent doesn't produce a null node, it keeps
            // searching down the pattern of left child
        }
        return y;
    }
    // Wrapper Method to find the height of the Tree
    void bst_height(Node node) {
        int h = height(node);
        System.out.println("The height of the tree: " + h);
    }
    int height(Node node) {
        if (node == null)
            return 0;
        else {
            int left_height = height(node.left);
            int right_height = height(node.right);
            if (left_height > right_height)
                return (left_height + 1);
            else
                return (right_height + 1);
        }
    }
    // Breadth First Search
    public void breadth_first() {
        if (root == null) {
            return;
        }
        // Creating a linked list
        Queue<Node> linkedNodes = new LinkedList<>();
        linkedNodes.add(root);
        while (!linkedNodes.isEmpty()) {
            Node node = linkedNodes.remove();
            System.out.print(" " + node.value);
            if (node.left != null) {
                linkedNodes.add(node.left);
            }
            if (node.right != null) {
                linkedNodes.add(node.right);
            }
        }
    }
    void preorder_traversal() {
        pre_order(root);
    }
    //PreOrder Traversal
    void pre_order(Node node) {
        if (node == null)
            return;
        //first print root node first
        System.out.print(node.value + " ");
        // then traverse left subtree recursively
        pre_order(node.left);
        // next traverse right subtree recursively
        pre_order(node.right);
    }
    //PostOrder Traversal
    void post_Order(Node node) {
        if (node == null)
            return;
        // first traverse left subtree recursively
        post_Order(node.left);
        // then traverse right subtree recursively
        post_Order(node.right);
        // now process root node
        System.out.print(node.value + " ");
    }
    void postTraversal() {
        post_Order(root);
    }
    // caller function to find nth largest element
    void n_largest(Node node, int n, counter X) {
        if (node == null || X.count >= n)
            return;
        // Doing inorder traversal in reverse so that the largest element is visited first
        this.n_largest(node.right, n, X);
        // Increment count
        X.count++;
        if (X.count == n) {
            System.out.println(n + " largest element is " +
                    node.value);
            return;
        }
        // traverse for left subtree
        this.n_largest(node.left, n, X);
    }
    // caller method to find the nth largest element
    void nlargest_caller(int n) {
        counter holding_object = new counter(); // count object
        this.n_largest(this.root, n, holding_object);
    }
}

