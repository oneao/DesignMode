package cn.oneao.SingletonPattern01;

/**
 * 双重锁方式 -> 懒汉式
 * 反射破坏单例方式
 */
public class Singleton9 {
    //私有构造方法
    private Singleton9() {}

    private static volatile Singleton9 instance;

    //对外提供静态方法获取该对象
    public static Singleton9 getInstance() {

        if(instance != null) {
            return instance;
        }

        synchronized (Singleton9.class) {
            if(instance != null) {
                return instance;
            }
            instance = new Singleton9();
            return instance;
        }
    }
}
