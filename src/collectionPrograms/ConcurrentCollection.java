package collectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollection {
    public static void concurrentModificationException() {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer value = it.next();
            System.out.println("List Value:" + value);
            if (value.equals(3))
//                list.remove(value); // Throw exception
                it.remove();// Don't throw exception if used in single threaded environment only
        }

        for (Integer value : list) {
            System.out.println("List Value:" + value);
        }
    }

    public static void concurrentModificationException1() {
        List<Integer> list = new CopyOnWriteArrayList<>();
        // Can be used in both single / multithreaded environment

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer value = it.next();
            System.out.println("List Value:" + value);
            if (value.equals(3))
                list.remove(value);
        }

        for (Integer value : list) {
            System.out.println("List Value:" + value);
        }
    }
}
