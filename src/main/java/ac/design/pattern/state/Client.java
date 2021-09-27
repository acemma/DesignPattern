package ac.design.pattern.state;

/**
 * @Author acemma
 * @Date 2021/9/27 10:19
 * @Description 状态模式
 *
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        // 当前电梯状态
        context.setLiftState(Context.CLOSING_STATE);

        context.open();
        context.run();
        context.close();
        context.stop();

    }

}
