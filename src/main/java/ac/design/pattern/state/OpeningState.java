package ac.design.pattern.state;

/**
 * @Author acemma
 * @Date 2021/9/27 10:02
 * @Description
 */
public class OpeningState extends LiftState {
    @Override
    public void open() {
        System.out.println("电梯门打开。。。");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSING_STATE);
        super.context.close();
    }

    @Override
    public void run() {
        // 什么都不做
    }

    @Override
    public void stop() {
        // 什么都不做
    }
}
