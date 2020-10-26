package ac.design.pattern.factory.statics;

/**
 * @author acemma
 * @date 2018/12/5 10:41
 * @Description 静态工厂模式测试
 */
public class StaticFactoryTest {
    public static void main(String[] args) {

        WhiteMan whiteMan = HumanFactory.createHuman(WhiteMan.class);
        whiteMan.getColor();

        YellowMan yellowMan = HumanFactory.createHuman(YellowMan.class);
        yellowMan.getColor();

        BlackMan blackMan = HumanFactory.createHuman(BlackMan.class);
        blackMan.getColor();

    }
}
