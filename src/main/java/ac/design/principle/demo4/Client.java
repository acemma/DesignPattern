package ac.design.principle.demo4;

/**
 * @Author acemma
 * @Date 2021/9/16 21:53
 * @Description 接口隔离原则-客户端不应该被迫依赖于它不使用的方法：一个类对另一个类的依赖应该建立在最小接口上
 */
public class Client {

    public static void main(String[] args) {
        MySafetyDoor mySafetyDoor = new MySafetyDoor();
        mySafetyDoor.antiTheft();
        mySafetyDoor.fireProof();
        mySafetyDoor.waterProof();

        YourSafetyDoor yourSafetyDoor = new YourSafetyDoor();
        yourSafetyDoor.antiTheft();
        yourSafetyDoor.fireProof();
    }

}
