package ac.design.pattern.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author acemma
 * @Date 2021/9/26 13:47
 * @Description
 */
public class Menu extends MenuComponent {

    private List<MenuComponent> menuComponentList = new ArrayList<>();

    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        // 打印菜单名称
        System.out.println(name);
        // 打印子菜单
        menuComponentList.forEach(MenuComponent::print);
    }
}
