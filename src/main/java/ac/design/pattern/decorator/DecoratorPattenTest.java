package ac.design.pattern.decorator;

/**
 * @Author acemma
 * @Date 2020/10/26 20:43
 * @Description 装饰者模式 是继承的一个替代模式
 *  在不影响其他对象的情况下，以动态透明的方式给单个对象添加职责
 *
 *  JDK中使用的装饰者模式：
 *  BufferedInputStream BufferedOutputStream BufferedReader BufferedWriter
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
