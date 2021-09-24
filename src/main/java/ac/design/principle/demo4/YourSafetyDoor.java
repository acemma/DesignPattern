package ac.design.principle.demo4;

/**
 * @Author acemma
 * @Date 2021/9/16 21:52
 * @Description
 */
public class YourSafetyDoor implements AntiTheft, FireProof {
    @Override
    public void antiTheft() {
        System.out.println("你的安全门防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("你的安全门防火");
    }
}
