package ac.design.principle.demo2;

/**
 * @Author acemma
 * @Date 2021/9/15 22:45
 * @Description 长方形
 */
public class Rectangle implements Quadrilateral{

    private int length;
    private int width;

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getWidth() {
        return width;
    }
}
