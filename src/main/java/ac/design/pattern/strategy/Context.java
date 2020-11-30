package ac.design.pattern.strategy;

/**
 * @Author acemma
 * @Date 2020/11/30 13:43
 * @Description
 */
public class Context {

    private Strategy strategy;

    public Context() {
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int x, int y) {
        return strategy.doOperation(x, y);
    }
}
