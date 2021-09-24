package ac.design.pattern.adapter.object;

/**
 * @Author acemma
 * @Date 2021/9/23 17:14
 * @Description
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        return "TF卡读取数据的数据：TF";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TF卡写入数据：" + msg);
    }
}
