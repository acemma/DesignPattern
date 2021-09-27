package ac.design.pattern.state;

/**
 * @Author acemma
 * @Date 2021/9/27 10:00
 * @Description 环境角色类
 */
public class Context {

    // 定义对应状态对象的常量
    public static final OpeningState OPENING_STATE = new OpeningState();
    public static final ClosingState CLOSING_STATE = new ClosingState();
    public static final RunningState RUNNING_STATE = new RunningState();
    public static final StoppingState STOPPING_STATE = new StoppingState();

    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    // 设置当前状态对象
    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        // 设置当前状态对象中的contex对象
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }
}
