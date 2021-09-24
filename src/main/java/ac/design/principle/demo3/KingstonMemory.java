package ac.design.principle.demo3;

/**
 * @Author acemma
 * @Date 2021/9/15 23:27
 * @Description
 */
public class KingstonMemory implements Memory{
    @Override
    public void save() {
        System.out.println("使用金士顿内存条");
    }
}
