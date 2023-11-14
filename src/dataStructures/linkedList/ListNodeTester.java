package dataStructures.linkedList;

public class ListNodeTester {
    public static void main(String[] args) {
        ListNode l4 = new ListNode("Messi", null);
        ListNode l3 = new ListNode("Steph Curry", l4);
        ListNode l2 = new ListNode("Ronaldo", l3);
        ListNode l1 = new ListNode("Michael Jordan", l2);

        ListNode temp = l1;

        // Insert new node at end of the list
        ListNode l5 = new ListNode("Garnett", null);
        while (temp != null) {
            if (temp.next == null) {
                temp.next = l5;
                break;
            }
            temp = temp.next;
        }

        System.out.println(l1.toString());
        l4.setNext(null);

        temp = l1;

        // Insert after Michael Jordan
        while (temp!=null){
            if(temp.player.equalsIgnoreCase("Michael Jordan")){
                l5.setNext(temp.next);
                temp.setNext(l5);
            }
            temp = temp.next;
        }
        System.out.println();
        System.out.println(l1.toString());
    }
}
