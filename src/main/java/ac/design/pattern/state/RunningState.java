package ac.design.pattern.state;

/**
 * @Author acemma
 * @Date 2021/9/27 10:02
 * @Description
 */
public class RunningState extends LiftState {
    @Override
    public void open() {
        // do nothing
    }

    @Override
    public void close() {
        // do nothing
    }

    @Override
    public void run() {
        System.out.println("电梯正在运行。。。");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.stop();
    }
}
