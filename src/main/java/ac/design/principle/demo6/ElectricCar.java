package ac.design.principle.demo6;

/**
 * @Author acemma
 * @Date 2021/9/16 22:50
 * @Description 电动车
 */
public class ElectricCar extends Car{


    @Override
    public void move() {
        super.getColor().color();
        System.out.println("电动车");
    }
}
