package ac.design.pattern.visitor;

/**
 * @Author acemma
 * @Date 2021/9/29 22:30
 * @Description 具体元素类
 */
public class Dog implements Animal {
    @Override
    public void accept(Person person) {
        person.feedDog(this);
        System.out.println("好好吃，汪！汪！汪！");
    }
}
