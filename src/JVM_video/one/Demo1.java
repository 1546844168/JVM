package JVM_video.one;

/**
 * @author 潇潇暮雨
 * @create 2018-11-06   14:25
 */
public class Demo1 {
    public static void main(String[] args) {
        // 自己编写了一个java.lang.String类
        // 根据双亲委派机制，会从启动类加载器中加载java.lang.String类。而不是加载自己定义的String类。
        System.out.println(new String().getClass().getClassLoader());
    }
}
