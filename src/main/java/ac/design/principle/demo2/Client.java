package ac.design.principle.demo2;

/**
 * @Author acemma
 * @Date 2021/9/15 23:00
 * @Description 里氏替换原则--子类可以扩展父类的功能，但不能修改父类原有的功能，
 * 换句话说，子类在继承父类时，除了新增方法完成新的功能，尽量不要重写父类的方法
 * 如果通过重写父类的方法完成新功能，这样写起来虽然简单，但是整个继承体系的复用性会很差，特别时运用多态频繁时，程序运行出错的可能性变大
 */
public class Client {


    public static void main(String[] args) {
        // 创建一个长方形对象
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        // 扩宽操作
        resize(rectangle);
        printLengthAndWidth(rectangle);

    }


    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    public static void printLengthAndWidth(Quadrilateral quadrilateral) {
        System.out.println(quadrilateral.getLength());
        System.out.println(quadrilateral.getWidth());
    }
}
