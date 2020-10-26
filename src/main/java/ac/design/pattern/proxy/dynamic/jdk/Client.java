package ac.design.pattern.proxy.dynamic.jdk;

/**
 * @Author acemma
 * @Date 2020/10/22 16:21
 * @Description 委托人
 */
public class Client implements Action {
    @Override
    public void litigation() {
        System.out.println("委托人：我有诉讼的需求");
    }

    @Override
    public void consult() {
        System.out.println("委托人：我有咨询的需求");
    }

}
