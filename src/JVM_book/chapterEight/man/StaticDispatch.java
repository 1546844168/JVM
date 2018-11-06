package JVM_book.chapterEight.man;

/**
 * @author 潇潇暮雨
 * @create 2018-11-03   13:54
 */
class Human {

}

class Man extends Human {

}

class Woman extends Human {

}

public class StaticDispatch {
    public void sayHello(Human human) {
        System.out.println("hello human");
    }

    public void sayHello(Man man) {
        System.out.println("hello man");
    }

    public void sayHello(Woman woman) {
        System.out.println("hello woman");
    }

    public static void main(String[] args) {
        StaticDispatch sd = new StaticDispatch();
        Human man = new Man();
        Human woman = new Woman();
        sd.sayHello((Man) man); //
        sd.sayHello(woman);
    }
}
