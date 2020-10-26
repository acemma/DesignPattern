package ac.design.pattern.factory.abstracts;

/**
 * @Author acemma
 * @Date 2020/10/26 10:59
 * @Description 惠普工厂
 */
public class HpFactory extends AbstractPcFactory{
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new HpKeyboard();
    }
}
