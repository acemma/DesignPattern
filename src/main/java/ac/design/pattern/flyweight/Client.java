package ac.design.pattern.flyweight;

/**
 * @Author acemma
 * @Date 2021/9/26 15:02
 * @Description 享元模式
 *
 * 使用场景：
 * 1. 一个系统有大量相同或相似的对象，造成内存的大量耗费
 * 2. 对象的大部分状态都可以外部化，可以江这些外部状态传入对象中
 * 3. 需要维护一个存储享元对象的享元池，这需要耗费一行的系统资源，因此，应该在多次使用对象的时候使用
 *
 * JDK源码中使用
 * Integer类型
 */
public class Client {

    public static void main(String[] args) {
        BoxFactory boxFactory = BoxFactory.getInstance();
        AbstractBox box1 = boxFactory.getShape("I");
        box1.display("灰色");

        AbstractBox box2 = boxFactory.getShape("L");
        box2.display("绿色");

        AbstractBox box3 = boxFactory.getShape("O");
        box3.display("蓝色");

        AbstractBox box4 = boxFactory.getShape("O");
        box4.display("红色");

        System.out.println(box3 == box4);
    }
}
