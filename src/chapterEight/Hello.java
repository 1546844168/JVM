package chapterEight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 潇潇暮雨
 * @create 2018-11-03   13:24
 */
public class Hello {
    public static void main(String[] args) {
        Hello hello = new Hello();
        //        String name = "林加铭";
//        Hello.sayHello();
//        System.gc();
//        int calc =hello.calc();
//        System.out.println(calc);
        hello.sayHello();
    }

    public static void sayHello() {
        final int i = 0;
        System.out.println("hello");
    }

    public int calc() {
        Object o = new Object();
        int a = 100;
        int b = 200;
        int c = 300;
        return (a + b) * c;
    }

    public void coll() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        System.out.println(list);
    }
}
