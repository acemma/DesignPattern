package ac.design.pattern.decorator;

/**
 * @Author acemma
 * @Date 2020/10/26 20:39
 * @Description
 */
public abstract class AbstractShapeDecorator {

    protected Shape shape;

    public AbstractShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        shape.draw();
    }

}
