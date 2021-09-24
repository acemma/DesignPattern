package ac.design.pattern.adapter.clazz;

/**
 * @Author acemma
 * @Date 2021/9/23 17:16
 * @Description
 */
public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        return "SD卡读取数据的数据：Hello SD";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SD卡写入数据：" + msg);
    }
}
