package ac.design.pattern.visitor;

/**
 * @Author acemma
 * @Date 2021/9/29 22:29
 * @Description 具体元素类
 */
public class Cat implements Animal{
    @Override
    public void accept(Person person) {
        person.feedCat(this);
        System.out.println("好好吃，喵~喵~喵~");
    }
}
