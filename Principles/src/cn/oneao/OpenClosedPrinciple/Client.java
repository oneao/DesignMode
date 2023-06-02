package cn.oneao.OpenClosedPrinciple;

public class Client {
    public static void main(String[] args) {
        //1.创建对外接口
        SougouSkin sougouSkin = new SougouSkin();
        //2.创建扩展类
        OneaoSkin oneaoSkin = new OneaoSkin();
        //3.进行设置
        sougouSkin.setSkin(oneaoSkin);
        //4.实现自定义类的方法
        sougouSkin.display();
    }
}
