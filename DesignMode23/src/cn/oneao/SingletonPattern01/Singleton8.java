package cn.oneao.SingletonPattern01;

/**
 * 静态内部类方式 -> 懒汉式
 * 序列化反序列化破坏单例模式
 */
public class Singleton8 {
    //私有构造方法
    private Singleton8() {}

    private static class SingletonHolder {
        private static final Singleton8 INSTANCE = new Singleton8();
    }

    //对外提供静态方法获取该对象
    public static Singleton8 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
