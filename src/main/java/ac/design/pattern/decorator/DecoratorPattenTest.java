package ac.design.pattern.decorator;

/**
 * @Author acemma
 * @Date 2020/10/26 20:43
 * @Description
 */
public class DecoratorPattenTest {

    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        AbstractShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        System.out.println("Circle with red border");
        redCircle.draw();

        AbstractShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Rectangle with red border");
        redRectangle.draw();

    }

}
