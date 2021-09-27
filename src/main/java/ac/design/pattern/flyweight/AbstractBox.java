package ac.design.pattern.flyweight;

/**
 * @Author acemma
 * @Date 2021/9/26 14:54
 * @Description
 */
public abstract class AbstractBox {

    public abstract String getShape();

    public void display(String color) {
        System.out.println("方块形状：" + getShape() + "，颜色:" + color);
    }

}
