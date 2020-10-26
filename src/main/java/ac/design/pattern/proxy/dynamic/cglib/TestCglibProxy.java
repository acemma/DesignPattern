package ac.design.pattern.proxy.dynamic.cglib;

/**
 * @Author acemma
 * @Date 2020/10/23 15:52
 * @Description
 */
public class TestCglibProxy {

    public static void main(String[] args) {
        Client client = (Client) new LawyerInterceptor().getInstance(new Client());
        client.litigation();
        client.consult();
        client.renting();//由于renting方法是个final方法，无法被子类继承，因此也无法被增强
    }

}
