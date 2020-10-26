package ac.design.pattern.factory.abstracts;

/**
 * @Author acemma
 * @Date 2020/10/26 11:03
 * @Description
 */
public class HpKeyboard implements Keyboard{
    @Override
    public void type() {
        System.out.println("HP keyboard type");
    }
}
