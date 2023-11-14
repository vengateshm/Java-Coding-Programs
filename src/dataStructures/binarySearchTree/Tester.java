package dataStructures.binarySearchTree;

public class Tester {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.addNode(2, "TWO");
        bst.addNode(1, "ONE");
        bst.addNode(3, "THREE");
        bst.addNode(0, "ZERO");

        bst.inOrderTraverseTree(bst.getRoot());
        bst.preOrderTraverseTree(bst.getRoot());
        bst.postOrderTraverseTree(bst.getRoot());

        System.out.println(bst.findNode(2));
        System.out.println(bst.findNode(0));
        System.out.println(bst.findNode(1));
        System.out.println(bst.findNode(3));
    }
}
