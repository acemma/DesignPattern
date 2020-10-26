package ac.design.pattern.factory.abstracts;

/**
 * @Author acemma
 * @Date 2020/10/26 10:55
 * @Description PC抽象工厂
 */
public abstract class AbstractPcFactory {

    public abstract Mouse createMouse();

    public abstract Keyboard createKeyboard();

}
