package ac.design.pattern.command;

import java.util.Map;
import java.util.Set;

/**
 * @Author acemma
 * @Date 2021/9/26 22:38
 * @Description 具体命令
 */
public class OrderCommand implements Command{

    // 厨师 命令接收者
    private Chief chief;

    // 订单
    private Order order;

    public OrderCommand(Chief chief, Order order) {
        this.chief = chief;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getTableNum() + "号桌的订单：");
        Map<String, Integer> foodMap = order.getFoodMap();
        Set<String> strings = foodMap.keySet();
        for (String name : strings) {
            chief.makeFood(name, foodMap.get(name));
        }
        System.out.println(order.getTableNum() + "号桌的餐品准备完毕");
    }
}
