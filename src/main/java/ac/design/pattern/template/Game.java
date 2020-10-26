package ac.design.pattern.template;

/**
 * @Author acemma
 * @Date 2020/10/26 20:53
 * @Description
 */
public abstract class Game {

    abstract void init();

    abstract void startPlay();

    abstract boolean isUpgrade();

    abstract void upgrade();

    abstract void endPlay();

    public final void play() {
        init();
        startPlay();
        if (isUpgrade()) {
            upgrade();
        }
        endPlay();
    }

}
