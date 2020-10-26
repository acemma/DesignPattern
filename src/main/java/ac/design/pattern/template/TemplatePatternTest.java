package ac.design.pattern.template;

/**
 * @Author acemma
 * @Date 2020/10/26 21:00
 * @Description
 */
public class TemplatePatternTest {

    public static void main(String[] args) {
        Game game = new HitMonster();
        game.play();
    }

}
