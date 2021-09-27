package ac.design.pattern.mediator;

/**
 * @Author acemma
 * @Date 2021/9/27 21:49
 * @Description  中介者模式
 *
 *  使用场景：
 *  1. 系统对象间存在复杂的引用，系统结构混乱
 *  2. 当想创建一个运行于多个类间的对象，又不想生产新的子类时。
 */
public class Client {

    public static void main(String[] args) {
        MediatorStructure mediator = new MediatorStructure();

        HouseOwner houseOwner = new HouseOwner("房东一代", mediator);
        Tenant tenant = new Tenant("租户1号", mediator);

        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);

        tenant.contact("我要租三室一厅的房子");
        houseOwner.contact("我有，你要租吗？");
    }
}
