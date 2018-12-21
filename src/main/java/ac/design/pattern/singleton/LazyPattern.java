package ac.design.pattern.singleton;

/**
 * @author acemma
 * @date 2018/12/21 15:38
 * @Description 懒汉式
 * 懒汉式在方法被调用之后才创建对象，以时间换空间，在多线程环境下存在风险
 */
public class LazyPattern {

    private static LazyPattern INSTANCE = null;

    private LazyPattern(){}

    public static LazyPattern getInstance(){
        if (INSTANCE == null){
            INSTANCE = new LazyPattern();
        }
        return INSTANCE;
    }

}
