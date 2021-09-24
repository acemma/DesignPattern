package ac.design.pattern.adapter.clazz;

/**
 * @Author acemma
 * @Date 2021/9/23 17:21
 * @Description
 */
public class SDAdapterTF extends TFCardImpl implements SDCard{


    @Override
    public String readSD() {
        System.out.println("使用适配器读取TF卡数据");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("使用适配器往TF卡写数据");
        writeTF(msg);
    }
}
