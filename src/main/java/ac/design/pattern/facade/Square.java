package ac.design.pattern.facade;

/**
 * @Author acemma
 * @Date 2020/11/30 14:03
 * @Description
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
