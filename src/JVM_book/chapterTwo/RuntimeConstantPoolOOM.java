package JVM_book.chapterTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 江峰
 * @create 2018-10-28 19:29
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (true) {
            System.out.println(i);
            list.add(String.valueOf(i++).intern());
        }
    }
}

class RuntimeConstantPoolOOM1 {
    public static void main(String[] args) {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);
        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);
    }
}