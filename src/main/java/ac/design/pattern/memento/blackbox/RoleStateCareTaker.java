package ac.design.pattern.memento.blackbox;


/**
 * @Author acemma
 * @Date 2021/10/8 11:11
 * @Description 备忘录对象管理对象
 */
public class RoleStateCareTaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
