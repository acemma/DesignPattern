package ac.design.principle.demo2;

/**
 * @Author acemma
 * @Date 2021/9/15 22:55
 * @Description 正方形
 */
public class Square implements Quadrilateral{

    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getLength() {
        return side;
    }

    @Override
    public int getWidth() {
        return side;
    }
}
