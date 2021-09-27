package ac.design.pattern.facade;

/**
 * @Author acemma
 * @Date 2020/11/30 14:06
 * @Description 外观模式 迪米特法则的典型应用
 *
 * 缺点： 不符合开闭原则，修改麻烦
 *
 * 使用场景：
 * 1. 当一个复杂系统的子系统很多时，外观模式可以为系统设计一个简单的接口提供外界访问
 *
 * 例如：
 * Tomcat里的RequestFacade
 */
public class FacadeTest {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }


}
