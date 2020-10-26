package ac.design.pattern.factory.abstracts;

/**
 * @Author acemma
 * @Date 2020/10/26 11:06
 * @Description
 */
public class DellKeyboard implements Keyboard{
    @Override
    public void type() {
        System.out.println("Dell keyboard type");
    }
}
