package ac.design.pattern.singleton;

/**
 * @author acemma
 * @date 2018/12/21 15:35
 * @Description 饿汉式
 * 饿汉式在类被初始化时就已经在内存中创建了对象，以空间换时间，所以不存在线程安全问题
 */
public class HungaryPattern {

    private static HungaryPattern INSTANCE = new HungaryPattern();

    private HungaryPattern(){}

    public static HungaryPattern getInstance(){
        return INSTANCE;
    }

}
