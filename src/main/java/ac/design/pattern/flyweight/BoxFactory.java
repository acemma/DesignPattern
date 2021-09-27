package ac.design.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author acemma
 * @Date 2021/9/26 14:57
 * @Description 工厂类，设计为单例
 */
public class BoxFactory {

    private Map<String, AbstractBox> map;

    private BoxFactory() {
        map = new HashMap<>();
        map.put("I", new IBox());
        map.put("L", new LBox());
        map.put("O", new OBox());
    }


    public AbstractBox getShape(String name) {
        return map.get(name);
    }

    public static BoxFactory getInstance() {
        return factory;
    }

    private static BoxFactory factory = new BoxFactory();
}
