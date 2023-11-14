package dataStructures.binarySearchTree;

public class BinarySearchTree {
    // 1. Search, insert / delete is quick
    // 2. Ordered arrays are bad at insertions / deletions
    // 3. Finding items in linked list is slow
    // 4. Time needed to perform an operation on a tree is O(log N)
    // 5. Tree is more efficient for several operations

    public static int traverseCount;

    // Root node
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void addNode(int key, String name) {

        Node newNode = new Node(key, name);

        // If root is null
        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;

            while (true) {
                parent = focusNode;

                if (key < focusNode.key) {
                    // In binary search tree, element lesser than root will be placed left
                    // Change focus to roots' left node
                    focusNode = focusNode.leftChild;

                    // Check if the left node of the root is null
                    // Only root node and no left node for root present
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    // In binary search tree, element greater than root will be placed right
                    // Change focus to roots' right node
                    focusNode = focusNode.rightChild;

                    // Check if the right node of the root is null
                    // Only root node and no right node for root present
                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    // In order traversal Left - Root - Right - Nodes traversed in ascending order
    public void inOrderTraverseTree(Node focusNode) {
        System.out.println(focusNode);
        traverseCount+=1;
        if (focusNode != null) {
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.rightChild);
        }
    }

    // Post order - Left - Right - Root
    public void postOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            postOrderTraverseTree(focusNode.leftChild);
            postOrderTraverseTree(focusNode.rightChild);
            System.out.println(focusNode);
        }
    }

    // Pre order traversal Root - Left - Right
    public void preOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            System.out.println(focusNode);
            preOrderTraverseTree(focusNode.leftChild);
            preOrderTraverseTree(focusNode.rightChild);
        }
    }

    public Node findNode(int key) {
        Node focusNode = root;

        while (focusNode.key != key) {
            if (key < focusNode.key) {
                focusNode = focusNode.leftChild;
            } else {
                focusNode = focusNode.rightChild;
            }
        }
        return focusNode;
    }
}
