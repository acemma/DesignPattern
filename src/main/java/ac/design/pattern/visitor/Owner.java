package ac.design.pattern.visitor;

/**
 * @Author acemma
 * @Date 2021/9/29 22:32
 * @Description 具体访问者
 */
public class Owner implements Person{
    @Override
    public void feedCat(Cat cat) {
        System.out.println("主人喂食猫");
    }

    @Override
    public void feedDog(Dog dog) {
        System.out.println("主人喂食狗");
    }
}
