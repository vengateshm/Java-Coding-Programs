package dataStructures.doublyLinkedList;

public interface DList<T> {
    boolean isEmpty();

    void insertAtHead(T data);

    void insertAtTail(T data);

    void remove(T data);

    void reverse();

    void traverseFromHead();

    void traverseFromTail();

    void traverseRecursivelyFromHead();

    void traverseRecursivelyFromTail();
}
