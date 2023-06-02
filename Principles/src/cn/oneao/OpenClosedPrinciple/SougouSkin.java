package cn.oneao.OpenClosedPrinciple;

/**
 * 对外接口
 */
public class SougouSkin {
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        skin.display();
    }
}
