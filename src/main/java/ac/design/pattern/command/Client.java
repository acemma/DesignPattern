package ac.design.pattern.command;


/**
 * @Author acemma
 * @Date 2021/9/26 22:52
 * @Description 命令模式
 *
 * 使用场景
 * 1. 系统需要将调用者/接收者解耦时
 *
 * JDK中 Runnable担当抽象命令，Thread充当调用者，start就是其执行方法
 */
public class Client {

    public static void main(String[] args) {
        Order order1 = new Order();
        order1.setTableNum(1);
        order1.setFood("西红柿鸡蛋面", 1);
        order1.setFood("小杯可乐", 2);

        Order order2 = new Order();
        order2.setTableNum(2);
        order2.setFood("尖椒肉丝盖饭", 1);
        order2.setFood("小杯雪碧", 1);

        Chief chief = new Chief();
        Command command1 = new OrderCommand(chief, order1);
        Command command2 = new OrderCommand(chief, order2);

        Waitress waitress = new Waitress();
        waitress.setCommands(command1);
        waitress.setCommands(command2);

        waitress.orderUp();
    }

}
