package ac.design.pattern.mediator;

/**
 * @Author acemma
 * @Date 2021/9/27 21:33
 * @Description 抽象中介类
 */
public abstract class Mediator {

    protected String message;

    protected Person person;

    public abstract void contact(String message, Person person);

}
