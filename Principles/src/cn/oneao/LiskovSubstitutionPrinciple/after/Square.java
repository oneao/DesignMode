package cn.oneao.LiskovSubstitutionPrinciple.after;
/**
 * @Description: 正方形
 */
public class Square implements Quadrilateral{
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getLength() {
        return side;
    }

    public double getWidth() {
        return side;
    }
}
