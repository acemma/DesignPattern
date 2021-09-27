package ac.design.pattern.state;

/**
 * @Author acemma
 * @Date 2021/9/27 10:02
 * @Description
 */
public class StoppingState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.OPENING_STATE);
        super.context.open();
    }

    @Override
    public void close() {
        // do nothing
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了。。。");
    }
}
