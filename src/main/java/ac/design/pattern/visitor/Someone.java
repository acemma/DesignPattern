package ac.design.pattern.visitor;

/**
 * @Author acemma
 * @Date 2021/9/29 22:33
 * @Description 抽象访问者
 */
public class Someone implements Person{


    @Override
    public void feedCat(Cat cat) {
        System.out.println("其他人喂食猫");
    }

    @Override
    public void feedDog(Dog dog) {
        System.out.println("其他人喂食狗");
    }
}
