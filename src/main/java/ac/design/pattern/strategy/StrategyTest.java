package ac.design.pattern.strategy;

/**
 * @Author acemma
 * @Date 2020/11/30 13:45
 * @Description 策略模式
 */
public class StrategyTest {

    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new AddStrategy());
        int result1 = context.executeStrategy(2, 3);
        System.out.println(result1);

        context.setStrategy(new SubtractStrategy());
        int result2 = context.executeStrategy(8, 6);
        System.out.println(result2);

        context.setStrategy(new MultiplyStrategy());
        int result3 = context.executeStrategy(4, 5);
        System.out.println(result3);
    }

}
