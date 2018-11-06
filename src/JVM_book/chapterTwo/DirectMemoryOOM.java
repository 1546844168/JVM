package JVM_book.chapterTwo;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author 江峰
 * @create 2018-10-28 20:10
 */
public class DirectMemoryOOM {

    public static void main(String[] args) {
        Field declaredField = Unsafe.class.getDeclaredFields()[0];

    }
}
