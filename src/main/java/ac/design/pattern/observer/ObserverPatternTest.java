package ac.design.pattern.observer;

/**
 * @Author acemma
 * @Date 2020/10/26 19:50
 * @Description 观察者模式
 *
 * 使用场景：
 * 1. 对象间存在一对多关系，一个对象的状态发生改变会影响其他对象
 * 2. 当一个抽象模型有两个方面，其中一个方面依赖另一方面时
 *
 * JDK中 Observable 类使用
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
