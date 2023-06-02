package cn.oneao.SingletonPattern01;

/**
 * 当通过反射方式调用构造方法进行创建创建时，直接抛异常。不运行此中操作。
 */
public class Singleton11 {
    //私有构造方法
    private Singleton11() {
        /*
           反射破解单例模式需要添加的代码
        */
        if(instance != null) {
            throw new RuntimeException();
        }
    }

    private static volatile Singleton11 instance;

    //对外提供静态方法获取该对象
    public static Singleton11 getInstance() {

        if(instance != null) {
            return instance;
        }

        synchronized (Singleton11.class) {
            if(instance != null) {
                return instance;
            }
            instance = new Singleton11();
            return instance;
        }
    }

}
