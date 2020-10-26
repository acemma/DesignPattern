package ac.design.pattern.observer;

/**
 * @Author acemma
 * @Date 2020/10/26 19:44
 * @Description 猫作为观察者，也作为被观察者
 */
public class Cat extends Subject implements Observer{
    @Override
    public void update(Subject subject) {
        if (subject instanceof Dog) {
            System.out.println("猫听到了狗叫声，害怕得叫了起来");
            scream();
        }
    }

    public void scream() {
        System.out.println("猫也叫了几声");
        super.notifyAllObserver();
    }


}
