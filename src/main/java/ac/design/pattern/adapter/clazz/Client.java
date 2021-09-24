package ac.design.pattern.adapter.clazz;

/**
 * @Author acemma
 * @Date 2021/9/23 17:19
 * @Description 类适配器模式违背了合成复用原则，
 */
public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer();

        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        System.out.println("============================");

        String msg2 = computer.readSD(new SDAdapterTF());
        System.out.println(msg2);

    }

}
