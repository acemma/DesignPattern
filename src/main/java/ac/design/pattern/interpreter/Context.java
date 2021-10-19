package ac.design.pattern.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author acemma
 * @Date 2021/10/8 11:48
 * @Description 环境角色类
 */
public class Context {

    // 定义一个map集合用来存储变量及对应的值
    private Map<Variable, Integer> map = new HashMap<>();

    // 添加变量
    public void assign(Variable var, Integer val) {
        map.put(var, val);
    }

    // 根据变量获取值
    public int getValue(Variable variable) {
        return map.get(variable);
    }


}
