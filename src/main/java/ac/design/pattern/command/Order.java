package ac.design.pattern.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author acemma
 * @Date 2021/9/26 22:33
 * @Description 订单类
 */
public class Order {

    // 餐桌号
    private int tableNum;

    // 餐品
    private Map<String, Integer> foodMap = new HashMap<>();

    public int getTableNum() {
        return tableNum;
    }

    public void setTableNum(int tableNum) {
        this.tableNum = tableNum;
    }

    public Map<String, Integer> getFoodMap() {
        return foodMap;
    }

    public void setFood(String name, Integer count) {
        foodMap.put(name, count);
    }
}
