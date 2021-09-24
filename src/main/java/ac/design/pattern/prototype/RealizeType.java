package ac.design.pattern.prototype;

/**
 * @Author acemma
 * @Date 2021/9/23 14:28
 * @Description
 */
public class RealizeType implements Cloneable{

    public RealizeType() {
        System.out.println("具体的原型对象创建了");
    }

    protected RealizeType clone() throws CloneNotSupportedException {

        return (RealizeType) super.clone();
    }
}
