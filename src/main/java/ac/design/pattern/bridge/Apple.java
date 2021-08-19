package ac.design.pattern.bridge;

/**
 * @Author acemma
 * @Date 2021/8/19 14:08
 * @Description
 */
public class Apple implements Brand{
    @Override
    public void info() {
        System.out.println("苹果品牌");
    }
}
