package ac.design.pattern.responsibility;

/**
 * @Author acemma
 * @Date 2021/9/27 8:50
 * @Description 请假条
 */
public class LeaveRequest {

    // 姓名
    private String name;
    // 请假天数
    private int num;
    // 请假说明
    private String note;

    public LeaveRequest(String name, int num, String note) {
        this.name = name;
        this.num = num;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getNote() {
        return note;
    }
}
