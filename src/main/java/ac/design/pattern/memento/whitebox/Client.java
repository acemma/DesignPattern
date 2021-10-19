package ac.design.pattern.memento.whitebox;

/**
 * @Author acemma
 * @Date 2021/10/8 11:12
 * @Description "白箱"备忘录模式
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("================大战Boss前=================");
        // 创建游戏角色
        GameRole gameRole = new GameRole();
        gameRole.initState();
        System.out.println(gameRole);

        // 将游戏角色状态备份
        RoleStateCareTaker roleStateCareTaker = new RoleStateCareTaker();
        roleStateCareTaker.setRoleStateMemento(gameRole.saveState());

        System.out.println("================大战Boss后=================");
        gameRole.fight();
        System.out.println(gameRole);

        System.out.println("================恢复角色状态后=================");
        gameRole.recoverState(roleStateCareTaker.getRoleStateMemento());
        System.out.println(gameRole);


    }

}
