package ac.design.pattern.adapter.object;


/**
 * @Author acemma
 * @Date 2021/9/23 17:21
 * @Description
 */
public class SDAdapterTF implements SDCard{

    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("使用适配器读取TF卡数据");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("使用适配器往TF卡写数据");
        tfCard.writeTF(msg);
    }
}
