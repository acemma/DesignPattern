package ac.design.pattern.template;

/**
 * @Author acemma
 * @Date 2020/10/26 21:00
 * @Description 模板方法--类行为型模式
 *
 * 使用场景：
 * 1. 整体步骤固定，单其中个别部分易变时，这时候可以使用模板方法模式，将容易变的部分抽象出来，供子类实现
 * 2. 需要通过子类来决定父类算法中某个步骤是否执行，实现子类对父类的反向控制
 *
 *
 */
public class TemplatePatternTest {

    public static void main(String[] args) {
        Game game = new HitMonster();
        game.play();
    }

}
