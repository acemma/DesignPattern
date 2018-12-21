package ac.design.pattern.singleton;

/**
 * @author acemma
 * @date 2018/12/21 15:52
 * @Description 静态内部类模式
 *
 * 静态内部类的优点是：外部类加载时并不需要立即加载内部类，内部类不被加载则不去初始化INSTANCE，故而不占内存。
 * 即当StaticInnerClassPattern第一次被加载时，并不需要去加载InnerSingleton，只有当getInstance()方法第一次被调用时，
 * 才会去初始化INSTANCE,第一次调用getInstance()方法会导致虚拟机加载InnerSingleton类，这种方法不仅能确保线程安全，
 * 也能保证单例的唯一性，同时也延迟了单例的实例化。
 */
public class StaticInnerClassPattern {

    private StaticInnerClassPattern(){}

    private static class InnerSingleton{
        private static StaticInnerClassPattern INSTANCE = new StaticInnerClassPattern();
    }

    public static StaticInnerClassPattern getInstance(){
        return InnerSingleton.INSTANCE;
    }

}
