package JVM_book.Thirteen;

/**
 * @author 江峰
 * @create 2018-11-05 15:12
 * <p>
 * 锁消除
 */
public class LockElimination {

    public String StringContact(String s1, String s2, String s3) {
        return s1 + s2 + s3;
    }
    public static void main(String[] args){
      LockElimination le = new LockElimination();
        String s = le.StringContact("he", "ll", "o");
        System.out.println(s);
    }
}
