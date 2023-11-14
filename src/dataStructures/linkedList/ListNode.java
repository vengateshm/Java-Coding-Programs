package dataStructures.linkedList;

public class ListNode {
    String player;
    ListNode next;

    public ListNode(String player, ListNode next) {
        this.player = player;
        this.next = next;
    }

    public void setNext(ListNode nextNode) {
        this.next = nextNode;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        ListNode temp = this;
        while (temp != null) {
            result.append(" [").append(temp.player).append("]");
            temp = temp.next;
        }
        return result.toString();
    }
}
