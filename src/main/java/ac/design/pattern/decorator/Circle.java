package ac.design.pattern.decorator;

/**
 * @Author acemma
 * @Date 2020/10/26 20:37
 * @Description
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("draw circle");
    }
}
