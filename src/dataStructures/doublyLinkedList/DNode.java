package dataStructures.doublyLinkedList;

public class DNode<T> {
    public DNode<T> previous;
    public DNode<T> next;
    public T data;

    public DNode(T data) {
        this.data = data;
    }

    public DNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(DNode<T> previous) {
        this.previous = previous;
    }

    public DNode<T> getNext() {
        return next;
    }

    public void setNext(DNode<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data.toString() + " > ";
    }
}
