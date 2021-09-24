package ac.design.principle.demo1;

/**
 * @Author acemma
 * @Date 2021/9/15 22:33
 * @Description 开闭原则--对扩展开放，对修改关闭
 */
public class ClientTest {

    public static void main(String[] args) {

        SogouInput sogouInput = new SogouInput();
        AbstractSkin skin = new DefaultSkin();
        sogouInput.setSkin(skin);
        sogouInput.display();

    }

}
