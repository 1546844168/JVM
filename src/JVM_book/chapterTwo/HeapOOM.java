package JVM_book.chapterTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 江峰
 * @create 2018-10-26 10:34
 */
public class HeapOOM {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            new HeapOOM(); // 这样是不会发生内存溢出的。因为虽然在一直创建对象，但是被垃圾回收掉了。
            System.out.println(i++);
        }
    }
}

class HeapOOM1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        int i = 0;
        while (true) {
            list.add(new Object());
            System.out.println(i++);
        }
    }
}
