package ac.design.pattern.proxy.dynamic.jdk;

/**
 * @Author acemma
 * @Date 2020/10/22 21:55
 * @Description
 * JDK 动态代理--基于接口
 */
public class TestJdkProxy {

    public static void main(String[] args) {
        Action action = new LawyerHandler().bind(new Client());
        action.litigation();
        action.consult();

    }

}
