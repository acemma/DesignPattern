package ac.design.pattern.proxy;

/**
 * @author acemma
 * @date 2018/12/5 11:36
 * @Description 代理模式测试
 */
public class ProxyTest {

    public static void main(String[] args) {

        ProxySubject proxySubject = new ProxySubject(new RealSubject());
        proxySubject.eat();
    }

}
