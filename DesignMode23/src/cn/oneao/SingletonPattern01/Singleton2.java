package cn.oneao.SingletonPattern01;

/**
 * 饿汉式
 */
public class Singleton2 {
    public Singleton2(){};

    private static Singleton2 instance;
    //采用静态代码块的方式创建对象
    static {
        instance = new Singleton2();
    }

    //给外部一个可以调用的方法
    public static Singleton2 getInstance(){
        return instance;
    }
}
