package ac.design.pattern.responsibility;

/**
 * @Author acemma
 * @Date 2021/9/27 9:12
 * @Description 小组长
 */
public class GroupLeader extends Handler{


    public GroupLeader() {
        super(0, Handler.NUM_ONE);
    }

    @Override
    protected void handleLeaveRequest(LeaveRequest request) {
        System.out.println(request.getName() + "请假" + request.getNum() + "天，" + request.getNote());
        System.out.println("小组长审批：同意");
    }
}
