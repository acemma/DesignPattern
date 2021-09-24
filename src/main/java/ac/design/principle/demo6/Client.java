package ac.design.principle.demo6;

/**
 * @Author acemma
 * @Date 2021/9/16 22:51
 * @Description  合成复用原则
 */
public class Client {

    public static void main(String[] args) {
        Car car = new PetrolCar();
        car.setColor(new Red());
        car.move();
        System.out.println("=======================");
        Car car2 = new ElectricCar();
        car2.setColor(new White());
        car2.move();
    }
}
