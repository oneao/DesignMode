package cn.oneao.LiskovSubstitutionPrinciple.after;

/**
 * 长方形类
 */
public class Rectangle implements Quadrilateral{
    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
