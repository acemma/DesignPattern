package ac.design.pattern.facade;

/**
 * @Author acemma
 * @Date 2020/11/30 14:06
 * @Description 外观模式
 */
public class FacadeTest {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }


}
