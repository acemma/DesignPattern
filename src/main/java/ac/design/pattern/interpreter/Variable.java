package ac.design.pattern.interpreter;

/**
 * @Author acemma
 * @Date 2021/10/8 11:49
 * @Description 封装变量的类
 */
public class Variable extends AbstractExpression{

    private String name;


    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        // 直接返回变量的值
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
