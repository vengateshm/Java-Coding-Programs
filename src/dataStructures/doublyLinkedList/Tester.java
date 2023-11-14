package dataStructures.doublyLinkedList;

public class Tester {
    public static void main(String[] args) {
        DList<Integer> list = new DLList<>();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);

        list.traverseFromHead();
        list.remove(20);
        list.traverseRecursivelyFromHead();
        list.reverse();
        list.traverseFromHead();

        list.insertAtTail(50);
        list.insertAtTail(60);
        list.insertAtTail(70);
        list.insertAtTail(80);

        list.traverseFromHead();
        list.traverseFromTail();

        list.remove(60);

        list.traverseRecursivelyFromTail();
        list.reverse();
        list.traverseFromTail();
    }
}
