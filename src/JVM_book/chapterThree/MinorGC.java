package JVM_book.chapterThree;

/**
 * @author 江峰
 * @create 2018-10-30 13:32
 */
public class MinorGC {
    public static final int _MB = 10242 * 1024;
    public static void main(String[] args){

    }

    public static void testAllocation(){
        byte[] allocation1,allocation2,allocation3,allocation4;
        MinorGC gc = new MinorGC();
        allocation1 = new byte[2 * _MB];
        allocation2 = new byte[2 * _MB];
        allocation3 = new byte[2 * _MB];
        allocation4 = new byte[4 * _MB];
        System.out.println("HelloWorld");
    }
}
