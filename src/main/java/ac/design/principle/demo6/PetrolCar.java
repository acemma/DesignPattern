package ac.design.principle.demo6;

/**
 * @Author acemma
 * @Date 2021/9/16 22:48
 * @Description 燃油车类
 */
public class PetrolCar extends Car{

    @Override
    public void move() {
        super.getColor().color();
        System.out.println( "燃油车");
    }


}
