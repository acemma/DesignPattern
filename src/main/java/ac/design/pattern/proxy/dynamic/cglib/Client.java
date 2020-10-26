package ac.design.pattern.proxy.dynamic.cglib;

/**
 * @Author acemma
 * @Date 2020/10/23 15:28
 * @Description
 */
public class Client {

    public void litigation() {
        System.out.println("委托人：我有诉讼的需求");
    }

    public void consult() {
        System.out.println("委托人：我有咨询的需求");
    }

    public final void renting() {
        System.out.println("委托人：我有租房的需求");
    }

}
