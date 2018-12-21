package ac.design.pattern.singleton;

/**
 * @author acemma
 * @date 2018/12/5 10:42
 * @Description 单例模式测试
 */
public class SingletonTest {

    public static void main(String[] args) {

        Emperor e1 = Emperor.getInstance();
        System.out.println(e1);
        Emperor e2 = Emperor.getInstance();
        System.out.println(e2);
        //e1和e2的对象ID一样
    }
}
