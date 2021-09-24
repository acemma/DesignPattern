package ac.design.principle.demo4;

/**
 * @Author acemma
 * @Date 2021/9/16 21:51
 * @Description
 */
public class MySafetyDoor implements AntiTheft, FireProof, WaterProof {
    @Override
    public void antiTheft() {
        System.out.println("我的安全门防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("我的安全门防火");
    }

    @Override
    public void waterProof() {
        System.out.println("我的安全门防水");
    }
}
