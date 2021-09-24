package ac.design.pattern.builder;

/**
 * @Author acemma
 * @Date 2020/10/26 20:18
 * @Description 建造者模式
 * 使用场景：
 * 1.创建的对象由多个部件构成，各部件面临着复杂的变化，但是构件间的建造顺序是稳定的
 * 2.创建复杂对象的算法独立于该对象的组成部分以及他们的装配方式，即产品的构建过程和最终的表示是独立的
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
