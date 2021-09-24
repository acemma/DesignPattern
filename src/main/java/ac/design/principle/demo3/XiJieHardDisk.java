package ac.design.principle.demo3;

/**
 * @Author acemma
 * @Date 2021/9/15 23:20
 * @Description
 */
public class XiJieHardDisk implements HardDisk{



    @Override
    public void saveData(String data) {
        System.out.println("希捷硬盘存储数据：" + data);
    }

    @Override
    public String getData() {
        System.out.println("使用希捷硬盘获取数据");
        return "数据";
    }
}
