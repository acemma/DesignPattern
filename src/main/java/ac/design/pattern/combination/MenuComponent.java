package ac.design.pattern.combination;

/**
 * @Author acemma
 * @Date 2021/9/24 16:54
 * @Description 菜单组件 -- 抽象根节点
 */
public abstract class MenuComponent {
    // 菜单组件名称
    protected String name;
    // 菜单组件层级
    protected int level;

    // 添加子菜单
    public void add(MenuComponent menuComponent) {

    }

    public void remove(MenuComponent menuComponent) {

    }

    public MenuComponent getChild(int index) {
        return null;
    }

    public String getName() {
        return name;
    }

    public abstract void print();
}
