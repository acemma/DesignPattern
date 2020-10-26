package ac.design.pattern.builder;

/**
 * @Author acemma
 * @Date 2020/10/26 20:18
 * @Description
 */
public class BuilderPatternTest {

    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .monitor("显示器")
                .box("机箱")
                .keyboard("键盘")
                .mouse("鼠标").build();

        System.out.println(computer);
    }

}
