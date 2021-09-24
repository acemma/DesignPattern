package ac.design.pattern.adapter.object;



/**
 * @Author acemma
 * @Date 2021/9/23 17:19
 * @Description 对象适配器模式
 * 使用场景：
 * 1. 以前开发的系统存在满足新系统功能需求的类，但其接口同新系统的接口不一致
 * 2. 使用第三方剔红的组件，但是组件接口定义和自己要求的接口不同
 *
 * JDK源码使用的适配器模式：
 * Reader（字符流） InputStream（字节流） 的适配使用的是 InputStreamReader
 */
public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer();

        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        System.out.println("============================");

        SDAdapterTF adapterTF = new SDAdapterTF(new TFCardImpl());
        String s = computer.readSD(adapterTF);
        System.out.println(s);

    }

}
