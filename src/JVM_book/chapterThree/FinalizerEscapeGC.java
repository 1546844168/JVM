package JVM_book.chapterThree;

/**
 * @author 江峰
 * @create 2018-10-29 9:29
 */
public class FinalizerEscapeGC {
    private static FinalizerEscapeGC fina = null;

    public static void isAlive() {
        System.out.println("I am still alive");
    }

    public static void isDead() {
        System.out.println("I am dead");
    }

    // 垃圾收集时会调用这个方法，系统只会自动调用一次。
   @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println(" finalize method execute");
        fina = this;

    }

    public static void main(String[] args) throws InterruptedException {
        fina = new FinalizerEscapeGC();
        // 不会被垃圾回收掉
        fina = null;
        System.gc(); // 会调用finallze();
        Thread.sleep(5);
        if (fina == null) {
            isDead();
        } else {
            isAlive();
        }
        // 会被垃圾回收掉
        fina = null;
        System.gc();
        Thread.sleep(5);
        if (fina == null) {
            isDead();
        } else {
            isAlive();
        }
    }
}
