package ac.design.pattern.mediator;

/**
 * @Author acemma
 * @Date 2021/9/27 21:42
 * @Description
 */
public class HouseOwner extends Person {

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void contact(String message) {
        mediator.contact(message, this);
    }

    public void getMessage(String message) {
        System.out.println("房东" + name + "获取到的信息是：" + message);
    }
}
