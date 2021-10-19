package ac.design.pattern.interpreter;

/**
 * @Author acemma
 * @Date 2021/10/8 11:47
 * @Description 抽象表达式类
 */
public abstract class AbstractExpression {

    public abstract int interpret(Context context);

}
