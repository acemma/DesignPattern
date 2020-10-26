package ac.design.pattern.decorator;


/**
 * @Author acemma
 * @Date 2020/10/26 20:41
 * @Description
 */
public class RedShapeDecorator extends AbstractShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    public void draw() {
        shape.draw();
        setBorder(shape);
    }

    private void setBorder(Shape shape) {
        System.out.println("Border color：Red");
    }
}
