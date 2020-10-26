package ac.design.pattern.observer;

/**
 * @Author acemma
 * @Date 2020/10/26 19:47
 * @Description 主人也是观察者
 */
public class Person implements Observer{

    @Override
    public void update(Subject subject) {
       if (subject instanceof Dog) {
           System.out.println("主人听到狗叫声，过去看看情况");
       } else if (subject instanceof Cat) {
           System.out.println("主人听到猫叫声，过去看看情况");
       }
    }
}
