package ac.design.pattern.responsibility;

/**
 * @Author acemma
 * @Date 2021/9/27 9:16
 * @Description 总经理
 */
public class GeneralManager extends Handler{

    public GeneralManager() {
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeaveRequest(LeaveRequest request) {
        System.out.println(request.getName() + "请假" + request.getNum() + "天，" + request.getNote());
        System.out.println("总经理审批：同意");
    }
}
