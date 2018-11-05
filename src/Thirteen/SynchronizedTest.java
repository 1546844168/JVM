package Thirteen;

/**
 * @author 江峰
 * @create 2018-11-05 9:43
 */
public class SynchronizedTest {
    private int i = 0;

    public synchronized void incr() {
        i++;
//        System.out.println(i);
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedTest synchronizedTest = new SynchronizedTest();
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10000; j++) {
                        synchronizedTest.incr();
                    }
                }
            }).start();
            Thread.yield();
        }
        Thread.sleep(100);
        System.out.println(synchronizedTest.i + "========");
    }
}
