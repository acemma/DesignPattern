package ac.design.pattern.factory.abstracts;

/**
 * @Author acemma
 * @Date 2020/10/26 11:05
 * @Description
 */
public class DellMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Dell mouse click");
    }
}
