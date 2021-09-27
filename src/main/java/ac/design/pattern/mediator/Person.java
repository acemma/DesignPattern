package ac.design.pattern.mediator;

/**
 * @Author acemma
 * @Date 2021/9/27 21:33
 * @Description 抽象同事类
 */
public abstract class Person {

    protected String name;

    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
