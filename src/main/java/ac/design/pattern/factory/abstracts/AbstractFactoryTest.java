package ac.design.pattern.factory.abstracts;

/**
 * @Author acemma
 * @Date 2020/10/26 11:08
 * @Description 抽象工厂方法
 * 使用场景：
 * 1.当需要创建的对象是一系列相互关联或相互依赖的产品族时，如电器工厂种的电视机、洗衣机、空调等
 * 2. 系统同种又多个产品族，单每次只使用其中的某一族产品，如有人只喜欢穿某一个品牌的衣服和鞋
 * 3. 系统中提供了产品的类库，且所有产品的接口相同，客户端不依赖茶品示例的创建细节和内部结构
 * 如：输入法换皮肤，一整套一起换。
 *
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
