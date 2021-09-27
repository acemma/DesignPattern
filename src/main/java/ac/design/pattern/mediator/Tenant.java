package ac.design.pattern.mediator;

/**
 * @Author acemma
 * @Date 2021/9/27 21:36
 * @Description 租户
 */
public class Tenant extends Person{


    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    // 和中介交流
    public void contact(String message) {
        mediator.contact(message, this);
    }

    // 获取信息
    public void getMessage(String message) {
        System.out.println("租户" + name + "获取的信息是：" + message);
    }
}
