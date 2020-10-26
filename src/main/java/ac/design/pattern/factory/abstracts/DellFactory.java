package ac.design.pattern.factory.abstracts;

/**
 * @Author acemma
 * @Date 2020/10/26 11:05
 * @Description 戴尔工厂
 */
public class DellFactory extends AbstractPcFactory{
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }
}
