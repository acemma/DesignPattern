package ac.design.principle.demo1;

/**
 * @Author acemma
 * @Date 2021/9/15 22:30
 * @Description 搜狗输入法 -- 有一个皮肤
 */
public class SogouInput {

    private AbstractSkin skin;

    public void display() {
        skin.display();
    }

    public AbstractSkin getSkin() {
        return skin;
    }

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }
}
