package JVM_video;

import java.util.ArrayList;

/**
 * @author 潇潇暮雨
 * @create 2018-11-06   16:54
 */
public class Demo4 {
    byte[] arr = new byte[1 * 1024 * 1024];// 1MB

    public static void main(String[] args) {
        ArrayList<Demo4> list = new ArrayList<>();
        int count = 0;
        try {
            while (true) {
                count++;
                System.out.println(count);
                list.add(new Demo4());
            }
        } catch (Throwable e) {  // 内存溢出是error。
            System.out.println(count);
        }

    }
}
