package ac.design.pattern.memento.blackbox;


/**
 * @Author acemma
 * @Date 2021/10/8 11:26
 * @Description "黑箱"备忘录模式
 *
 * 使用场景：
 * 1.需要保存与恢复数据的场景，如玩游戏时的中间结果的存档功能
 * 2. 需要提供一个可回滚操作的场景，如数据库中事务操作
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
        roleStateCareTaker.setMemento(gameRole.saveState());

        System.out.println("================大战Boss后=================");
        gameRole.fight();
        System.out.println(gameRole);

        System.out.println("================恢复角色状态后=================");
        gameRole.recoverState(roleStateCareTaker.getMemento());
        System.out.println(gameRole);
    }

}
