package ac.design.principle.demo5;

/**
 * @Author acemma
 * @Date 2021/9/16 22:19
 * @Description 迪米特法则 -- 又叫最少知识原则 只和你的朋友交谈，不和陌生人说话。其目的是保证模块之间的独立性，降低耦合性
 */
public class Client {

    public static void main(String[] args) {
        Agent agent = new Agent();
        agent.setStar(new Star("林青霞"));
        agent.setFans(new Fans("李四"));
        agent.setCompany(new Company("米未传媒有限公司"));

        agent.meeting();
        agent.business();
    }

}
