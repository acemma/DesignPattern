package ac.design.pattern.factory.abstracts;

/**
 * @Author acemma
 * @Date 2020/10/26 11:02
 * @Description
 */
public class HpMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("HP mouse click");
    }
}
