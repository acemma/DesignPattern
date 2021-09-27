package ac.design.pattern.responsibility;

/**
 * @Author acemma
 * @Date 2021/9/27 8:51
 * @Description 抽象处理人
 */
public abstract class Handler {

    protected static final int NUM_ONE = 1;
    protected static final int NUM_THREE = 3;
    protected static final int NUM_SEVEN = 7;

    // 领导处理请假天数区间
    private int numStart;
    private int numEnd;

    // 后续处理人
    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    // 设置后续处理人
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // 各级领导处理请假条的方法
    protected abstract void handleLeaveRequest(LeaveRequest request);

    // 提交请假条
    public final void submit(LeaveRequest request) {
        this.handleLeaveRequest(request);
        if (this.nextHandler != null && request.getNum() > this.numEnd) {
            // 提交给上级
            this.nextHandler.submit(request);
        } else {
            System.out.println("流程结束！");
        }
    }
}
