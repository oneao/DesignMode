package cn.oneao.SingletonPattern01;

/**
 * 解决序列化反序列化破解单例模式
 */
public class Singleton10 {
    //私有构造方法
    private Singleton10() {}

    private static class SingletonHolder {
        private static final Singleton10 INSTANCE = new Singleton10();
    }

    //对外提供静态方法获取该对象
    public static Singleton10 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * 下面是为了解决序列化反序列化破解单例模式
     */
    private Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}
