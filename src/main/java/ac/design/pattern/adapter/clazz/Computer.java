package ac.design.pattern.adapter.clazz;

/**
 * @Author acemma
 * @Date 2021/9/23 17:18
 * @Description
 */
public class Computer {

    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sd card is null");
        }
        return sdCard.readSD();
    }

}
