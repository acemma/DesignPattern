package ac.design.pattern.template;

/**
 * @Author acemma
 * @Date 2020/10/26 20:59
 * @Description
 */
public class HitMonster extends Game {
    @Override
    void init() {
        System.out.println("游戏初始化。。。");
    }

    @Override
    void startPlay() {
        System.out.println("开始打游戏");
    }

    @Override
    boolean isUpgrade() {
        return true;
    }

    @Override
    void upgrade() {
        System.out.println("升级");
    }

    @Override
    void endPlay() {
        System.out.println("结束游戏");
    }
}
