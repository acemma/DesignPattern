package ac.design.pattern.prototype.demo;

/**
 * @Author acemma
 * @Date 2021/9/23 14:35
 * @Description
 */
public class Citation implements Cloneable{

    private String name;


    public Citation clone() throws CloneNotSupportedException {
        Citation citation = (Citation) super.clone();

        return citation;
    }

    public void show() {
        System.out.println(name + "同学：在2021学年第一学期种表现优秀，被评为三号学生，特发此状！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
