package ac.design.pattern.factory;

/**
 * @author acemma
 * @date 2018/12/5 10:45
 * @Description 工厂类
 */
public class HumanFactory {

    public static <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误");
        }
        return (T) human;
    }
}
