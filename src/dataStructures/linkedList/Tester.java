package dataStructures.linkedList;

public class Tester {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();

        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(4);
        linkedList.addNode(5);
        linkedList.addNode(6);

        linkedList.head.next.next.next = linkedList.head.next;
        linkedList.findCycle(); // T - O(n), S - O(1)
//        linkedList.printNode();
//        linkedList.printMiddleNode();
    }
}
