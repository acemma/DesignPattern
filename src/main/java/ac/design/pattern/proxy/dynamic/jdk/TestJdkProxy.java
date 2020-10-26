package ac.design.pattern.proxy.dynamic.jdk;

/**
 * @Author acemma
 * @Date 2020/10/22 21:55
 * @Description
 */
public class TestJdkProxy {

    public static void main(String[] args) {
        Action action = new LawyerHandler().bind(new Client());
        action.litigation();
        action.consult();

    }

}
