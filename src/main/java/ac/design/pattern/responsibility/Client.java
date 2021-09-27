package ac.design.pattern.responsibility;

/**
 * @Author acemma
 * @Date 2021/9/27 9:17
 * @Description 责任链模式
 *
 * JavaWeb中的FilterChain应用了责任链模式
 */
public class Client {

    public static void main(String[] args) {
        LeaveRequest request = new LeaveRequest("小明", 4, "身体不适");

        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();
        // 设置上级领导
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        // 提交请假申请
        groupLeader.submit(request);

    }

}
