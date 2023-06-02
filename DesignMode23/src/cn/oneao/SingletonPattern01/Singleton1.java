package cn.oneao.SingletonPattern01;

/**
 * 1.饿汉式创建单例模式
 *  静态变量创建类的对象
 */
public class Singleton1 {
    //静态方法
    private Singleton1(){};
    //创建私有静态成员变量
    private static Singleton1 instance = new Singleton1();

    //给外部一个可以调用的方法
    public Singleton1 getInstance(){
        return instance;
    }
}
