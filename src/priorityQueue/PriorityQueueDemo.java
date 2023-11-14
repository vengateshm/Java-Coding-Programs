package priorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(300);
        pq.add(70);
        pq.add(10);
        pq.add(250);

        System.out.println("Size : " + pq.size());
        System.out.println("Remove : " + pq.remove());
        System.out.println("Poll : " + pq.poll());
        System.out.println("Size : " + pq.size());
        System.out.println("Peek : " + pq.peek());
        System.out.println("Size : " + pq.size());

        PriorityQueue<Employee> empQueue = new PriorityQueue<>(new EmployeeComparator());
        empQueue.add(new Employee("A", 300.0));
        empQueue.add(new Employee("B", 200.0));
        empQueue.add(new Employee("C", 4000.0));
        empQueue.add(new Employee("D", 50.0));
        empQueue.add(new Employee("E", 10.0));
        empQueue.add(new Employee("F", 3500.0));
        empQueue.add(new Employee("G", 50000.0));

        System.out.println("Employee queue Poll : " + empQueue.poll());
        System.out.println(empQueue);

        PriorityQueue<String> strCmp = new PriorityQueue<>(new StringLengthComparator());
        strCmp.add("Vengatesh");
        strCmp.add("Vengat");
        strCmp.add("Vengatesh M");

        System.out.println("Queue Poll : " + strCmp.poll());
    }
}
