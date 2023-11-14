package dataStructures.doublyLinkedList;

public class DLList<T> implements DList<T> {
    DNode<T> head = null;
    DNode<T> tail = null;

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void insertAtHead(T data) {
        DNode<T> node = new DNode<>(data);
        if (isEmpty()) {
            head = tail = node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
            head = node;
        }
    }

    @Override
    public void insertAtTail(T data) {
        DNode<T> node = new DNode<>(data);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
            tail = node;
        }
    }

    @Override
    public void remove(T data) {
        if (isEmpty()) {
            System.out.println("List is Empty");
        } else if (head.getData().equals(data)) {
            head = head.getNext();
        } else if (tail.getData().equals(data)) {
            tail = tail.getPrevious();
        } else {
            DNode<T> cur = head.getNext();
            while (cur != null) {
                if (cur.getData().equals(data)) {
                    cur.getPrevious().setNext(cur.getNext());
                    cur.getNext().setPrevious(cur.getPrevious());
                    break;
                }
                cur = cur.getNext();
            }
        }
    }

    @Override
    public void reverse() {
        //40,30,10
        DNode<T> temp = null;
        DNode<T> oldHead = head;
        DNode<T> cur = head;
        while (cur != null) {
            temp = cur.getPrevious();
            cur.setPrevious(cur.getNext());
            cur.setNext(temp);
            cur = cur.getPrevious();
        }
        if(temp!=null){
            head = temp.getPrevious();
        }
        tail=oldHead;
    }

    @Override
    public void traverseFromHead() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        DNode<T> cur = head;
        while (cur != null) {
            System.out.print(cur);
            cur = cur.getNext();
        }
        System.out.println();
    }

    @Override
    public void traverseFromTail() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        DNode<T> cur = tail;
        while (cur != null) {
            System.out.print(cur);
            cur = cur.getPrevious();
        }
        System.out.println();
    }

    @Override
    public void traverseRecursivelyFromHead() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        traverseHead(head);
        System.out.println();
    }

    private void traverseHead(DNode<T> node) {
        if (node == null) {
            return;
        }
        System.out.print(node);
        traverseHead(node.getNext());
    }

    @Override
    public void traverseRecursivelyFromTail() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        traverseTail(tail);
        System.out.println();
    }

    private void traverseTail(DNode<T> node) {
        if (node == null) {
            return;
        }
        System.out.print(node);
        traverseTail(node.getPrevious());
    }
}
