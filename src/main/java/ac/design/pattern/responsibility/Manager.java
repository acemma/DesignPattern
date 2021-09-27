package ac.design.pattern.responsibility;

/**
 * @Author acemma
 * @Date 2021/9/27 9:14
 * @Description 部门经理
 */
public class Manager extends Handler{

    public Manager() {
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    @Override
    protected void handleLeaveRequest(LeaveRequest request) {
        System.out.println(request.getName() + "请假" + request.getNum() + "天，" + request.getNote());
        System.out.println("部门经理审批：同意");
    }
}
