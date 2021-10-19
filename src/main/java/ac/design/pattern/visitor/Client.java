package ac.design.pattern.visitor;

/**
 * @Author acemma
 * @Date 2021/9/29 22:37
 * @Description 访问者模式
 */
public class Client {

    public static void main(String[] args) {
        Home home = new Home();
        home.addAnimal(new Dog());
        home.addAnimal(new Cat());

        home.accept(new Owner());
        home.accept(new Someone());
    }

}
