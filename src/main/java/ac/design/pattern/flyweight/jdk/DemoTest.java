package ac.design.pattern.flyweight.jdk;

/**
 * @Author acemma
 * @Date 2021/9/26 15:11
 * @Description
 */
public class DemoTest {

    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;

        System.out.println(i1 == i2); // true

        Integer i3 = 128;
        Integer i4 = 128;

        System.out.println(i3 == i4); // false
    }

}
