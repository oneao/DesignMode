package cn.oneao.SingletonPattern01;

/**
 * 懒汉式：静态内部类方式
 */
public class Singleton6 {
    private Singleton6(){};

    private static class SingletonHolder{
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    //对外提供方法获取
    public static Singleton6 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
