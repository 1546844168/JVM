package JVM_video;

/**
 * @author 潇潇暮雨
 * @create 2018-11-06   11:36
 */
public class Demo2 {
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(obj.getClass().getClassLoader());
        System.out.println("----------------------------------------------");
        Demo1 demo1 = new Demo1(); // classpath下
        System.out.println(demo1.getClass().getClassLoader());// 默认的加载器
        System.out.println(demo1.getClass().getClassLoader().getParent());
        System.out.println(demo1.getClass().getClassLoader().getParent().getParent());
        System.out.println("--------------------------------------");


    }
}
