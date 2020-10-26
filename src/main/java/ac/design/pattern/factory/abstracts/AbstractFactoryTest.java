package ac.design.pattern.factory.abstracts;

/**
 * @Author acemma
 * @Date 2020/10/26 11:08
 * @Description
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractPcFactory factory = FactoryProducer.getFactory(HpFactory.class);
        Mouse mouse = factory.createMouse();
        Keyboard keyboard = factory.createKeyboard();
        mouse.click();
        keyboard.type();
    }

}
