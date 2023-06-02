package cn.oneao.SingletonPattern01;

/**
 * 懒汉式：双重检查锁
 */
public class Singleton5 {
    //私有构造方法
    private Singleton5() {}

    /**
     * 在多线程的情况下，可能出现空指针问题，出现的问题在于JVM在实例化对象时会进行优化和指令重排序操作。
     * 要解决该问题：加上volatile关键字，该关键字可以保证可见性和有序性。
     */
    private static volatile Singleton5 instance;

    public static Singleton5 getInstance(){
        //第一次判断，如果instance不为null，不进入抢锁阶段，直接返回实例
        if(instance == null){
            synchronized (Singleton5.class){
                //拿到锁在判断是否为null
                if (instance == null){
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}
