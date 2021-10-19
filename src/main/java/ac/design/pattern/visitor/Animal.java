package ac.design.pattern.visitor;

/**
 * @Author acemma
 * @Date 2021/9/29 22:27
 * @Description 抽象元素类
 */
public interface Animal {

    void accept(Person person);
}
