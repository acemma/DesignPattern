package ac.design.pattern.proxy.statics;

/**
 * @author acemma
 * @date 2018/12/5 11:18
 * @Description 真实主体
 */
public class RealSubject implements Subject {

    @Override
    public void eat() {
        System.out.println("吃饭");
    }

}
