package ac.design.pattern.visitor;

/**
 * @Author acemma
 * @Date 2021/9/29 22:28
 * @Description 抽象访问者
 */
public interface Person {

    void feedCat(Cat cat);

    void feedDog(Dog dog);
}
