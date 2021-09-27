package ac.design.pattern.iterator;

/**
 * @Author acemma
 * @Date 2021/9/27 22:08
 * @Description
 */
public class Student {

    private String name;

    private int number;

    public Student() {
    }

    public Student(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
