package ac.design.pattern.combination;/**
 * 
 * @Author acemma
 * @Date 2021/9/26 13:54
 * @Description 组合模式 -- 透明组合模式
 *
 * 应用场景：
 * 1. 出现树形结构的地方
 */

public class Client {

    public static void main(String[] args) {
        MenuComponent menu1 = new Menu("菜单管理", 2);
        menu1.add(new MenuItem("页面访问", 3));
        menu1.add(new MenuItem("展开菜单", 3));
        menu1.add(new MenuItem("编辑菜单", 3));
        menu1.add(new MenuItem("删除菜单", 3));
        menu1.add(new MenuItem("新增菜单", 3));

        MenuComponent menu2 = new Menu("权限管理", 2);
        menu2.add(new MenuItem("页面访问", 3));
        menu2.add(new MenuItem("提交保存", 3));

        MenuComponent menu3 = new Menu("角色管理", 2);
        menu3.add(new MenuItem("页面访问", 3));
        menu3.add(new MenuItem("新增角色", 3));
        menu3.add(new MenuItem("修改角色", 3));

        MenuComponent component = new Menu("系统管理", 1);
        component.add(menu1);
        component.add(menu2);
        component.add(menu3);

        component.print();
    }
}
