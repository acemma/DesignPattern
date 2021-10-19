package ac.design.pattern.interpreter;

/**
 * @Author acemma
 * @Date 2021/10/8 22:58
 * @Description 解释器模式
 */
public class Client {

    public static void main(String[] args) {
        // 创建环境类
        Context context = new Context();

        // 创建变量
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");

        // 保存变量
        context.assign(a, 1);
        context.assign(b, 2);
        context.assign(c, 3);
        context.assign(d, 4);

        // 抽象语法树
        AbstractExpression expression = new Minus(a, new Plus(new Minus(b,c), d));
        int result = expression.interpret(context);
        System.out.println(expression);
        System.out.println(result);

    }
}
