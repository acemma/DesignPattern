package ac.design.pattern.observer;

/**
 * @Author acemma
 * @Date 2020/10/26 19:46
 * @Description 老鼠作为观察者
 */
public class Mouse implements Observer{
    @Override
    public void update(Subject subject) {
        if (subject instanceof Cat) {
            System.out.println("老鼠听到猫叫声，撒腿就跑");
        }
    }
}
