package ac.design.pattern.memento.whitebox;

/**
 * @Author acemma
 * @Date 2021/10/8 11:11
 * @Description 备忘录对象管理对象
 */
public class RoleStateCareTaker {

    private RoleStateMemento roleStateMemento;


    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
