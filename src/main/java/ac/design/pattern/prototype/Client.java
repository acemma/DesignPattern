package ac.design.pattern.prototype;

/**
 * @Author acemma
 * @Date 2021/9/23 14:31
 * @Description 原型模式
 * 使用场景：
 * 1.对象的创建非常复杂，可以使用原型模式快捷的创建对象
 * 2.想能和安全要求比较高
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建原型对象
        RealizeType realizeType = new RealizeType();

        // 克隆
        RealizeType clone = realizeType.clone();

        System.out.println(realizeType == clone);

    }

}
