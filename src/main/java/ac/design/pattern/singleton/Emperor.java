package ac.design.pattern.singleton;

/**
 * @author acemma
 * @date 2018/12/5 10:27
 * @Description 单例模式
 */
public class Emperor {
    /**
     * 饿汉式初始化
     */
    private static Emperor ourInstance = new Emperor();

    public static Emperor getInstance() {
        return ourInstance;
    }

    /**
     * 单例模式最重要的特点，构造私有化
     */
    private Emperor() {
    }
}
