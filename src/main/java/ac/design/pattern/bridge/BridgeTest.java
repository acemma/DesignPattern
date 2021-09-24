package ac.design.pattern.bridge;

/**
 * @Author acemma
 * @Date 2021/8/19 14:14
 * @Description 桥接模式
 * 使用场景：
 * 1. 当一个类存在两个变化的纬度时，且这两个纬度都需要扩展
 */
public class BridgeTest {

    public static void main(String[] args) {
        AbstractComputer computer1 = new Desktop(new Lenovo());
        computer1.info();
        System.out.println("===============================");
        AbstractComputer computer2 = new Laptop(new Dell());
        computer2.info();
        System.out.println("===============================");
        AbstractComputer computer3 = new Pad(new Apple());
        computer3.info();

    }
}
