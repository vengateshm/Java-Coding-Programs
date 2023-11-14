package dataStructures.binarySearchTree;

public class Node {
    // In binary search tree a node can have at most 2 children
    int key;
    String name;

    Node leftChild;
    Node rightChild;

    public Node(int key, String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node : " + key + " => " + name;
    }
}
