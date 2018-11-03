package chapterTwo;

/**
 * @author 江峰
 * @create 2018-10-28 19:16
 *
 * 测试StackOverflowError
 */
public class StackOOM {
    private static int count = 0;
    public static void fun(){
        count++;
        fun();
    }
    public static void main(String[] args){

        try {
            new StackOOM().fun();
        } catch (Throwable e) { // 注意：是error，不是异常
            e.printStackTrace();
        } finally {
            System.out.println(StackOOM.count);
        }
    }
}
