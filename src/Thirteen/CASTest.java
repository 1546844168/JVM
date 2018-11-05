package Thirteen;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author 江峰
 * @create 2018-11-05 14:34
 */
public class CASTest {
    private static AtomicInteger race = new AtomicInteger(0);

    public static void race() {
        race.incrementAndGet();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10000; j++) {
                        race();
                    }
                }
            }).start();
        }
        // 等待所有线程执行结束
//        while (Thread.activeCount() > 1)
//            Thread.yield();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(race);
    }

}
