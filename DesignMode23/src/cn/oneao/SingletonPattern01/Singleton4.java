package cn.oneao.SingletonPattern01;

/**
 * 懒汉式：线程安全
 * 这里加的锁是对象锁，也可以称为实例锁，它是通过synchronized关键字修饰的getInstance()方法实现的。
 * 在该方法中，使用了synchronized关键字对方法进行加锁，保证了该方法在并发环境下的同步性和原子性，保证了线程安全。
 * 同时，加锁也会造成性能上的一些影响，因为在加锁期间其他线程需要等待锁的释放才能执行。
 */
public class Singleton4 {
    private Singleton4(){};

    private static Singleton4 instance;

    public static synchronized Singleton4 getInstance(){
        if (instance == null){
            instance = new Singleton4();
        }
        return instance;
    }
}
