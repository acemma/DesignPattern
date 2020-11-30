package ac.design.pattern.strategy;

/**
 * @Author acemma
 * @Date 2020/11/30 13:41
 * @Description
 */
public class SubtractStrategy implements Strategy{
    @Override
    public int doOperation(int x, int y) {
        return x - y;
    }
}
