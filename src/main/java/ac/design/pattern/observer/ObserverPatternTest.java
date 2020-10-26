package ac.design.pattern.observer;

/**
 * @Author acemma
 * @Date 2020/10/26 19:50
 * @Description
 */
public class ObserverPatternTest {

    public static void main(String[] args) {
        Dog dog = new Dog(); //被观察者
        Person person = new Person(); //观察者，观察狗和猫
        Cat cat = new Cat(); //既是观察者又是被观察者，观察狗
        Mouse mouse = new Mouse(); //观察者，观察猫

        dog.addObserver(person);
        dog.addObserver(cat);

        cat.addObserver(mouse);
        cat.addObserver(person);
        dog.bark();

    }

}
