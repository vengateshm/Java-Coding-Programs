package collectionPrograms;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollectionMultiThread {

    private final List<Integer> list = new CopyOnWriteArrayList<>();

    public void initList() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
    }

    public void thread1() {
        new Thread(() -> {
            for (Integer v : list) {
                System.out.println(v);
            }
            System.out.println("++++++++++");
        }).start();
    }

    public void thread2() {
        new Thread(() -> {
            list.remove(Integer.valueOf(2));
            list.remove(Integer.valueOf(5));
            list.remove(Integer.valueOf(7));
        }).start();
    }

    public void printList() {
        for (Integer v : list) {
            System.out.println(v);
        }
    }
}
