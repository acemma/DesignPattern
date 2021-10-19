package ac.design.pattern.interpreter;

/**
 * @Author acemma
 * @Date 2021/10/8 22:48
 * @Description 加法表达式类
 */
public class Plus extends AbstractExpression{

    // 加号左边的表达式
    private AbstractExpression left;
    // 加号右边的表达式
    private AbstractExpression right;

    public Plus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" +  left.toString() + "+" + right.toString() + ")";
    }
}
