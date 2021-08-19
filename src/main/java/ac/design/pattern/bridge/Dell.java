package ac.design.pattern.bridge;

/**
 * @Author acemma
 * @Date 2021/8/19 14:07
 * @Description
 */
public class Dell implements Brand{
    @Override
    public void info() {
        System.out.println("戴尔品牌");
    }
}
