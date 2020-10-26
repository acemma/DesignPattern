package ac.design.pattern.observer;


/**
 * @Author acemma
 * @Date 2020/10/26 19:41
 * @Description 狗作为被观察者
 */
public class Dog extends  Subject {

    public void bark() {
        System.out.println("狗叫了几声");
        super.notifyAllObserver();
    }

}
