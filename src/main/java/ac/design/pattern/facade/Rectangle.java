package ac.design.pattern.facade;

/**
 * @Author acemma
 * @Date 2020/11/30 14:02
 * @Description
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
