package collectionPrograms;

public class Tester {
    public static void main(String[] args){
//        ConcurrentCollection.concurrentModificationException();
//        ConcurrentCollection.concurrentModificationException1();
        ConcurrentCollectionMultiThread cm = new ConcurrentCollectionMultiThread();
        cm.initList();
        cm.thread1();
        cm.thread2();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cm.printList();
    }
}
