/**
 * @author 江峰
 * @create 2020-04-16   17:26
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("系统的最大空间Xmx=" + Runtime.getRuntime().maxMemory() / 1024.0 / 1024 + "M");
        System.out.println("系统的空闲空间free mem=" + Runtime.getRuntime().freeMemory() / 1024.0 / 1024 + "M");
        System.out.println("当前可用的总空间total mem=" + Runtime.getRuntime().totalMemory() / 1024.0 / 1024 + "M");
    }
}
