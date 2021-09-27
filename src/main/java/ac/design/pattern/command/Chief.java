package ac.design.pattern.command;

/**
 * @Author acemma
 * @Date 2021/9/26 22:36
 * @Description 厨师-充当命令接收者
 */
public class Chief {


    public void makeFood(String name, Integer num) {
        System.out.println("餐品：" + name + num + "份");
    }
}
