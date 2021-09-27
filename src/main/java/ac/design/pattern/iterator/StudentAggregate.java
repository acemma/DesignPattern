package ac.design.pattern.iterator;

/**
 * @Author acemma
 * @Date 2021/9/27 22:09
 * @Description
 */
public interface StudentAggregate {

    void add(Student student);

    void remove(Student student);

    StudentIterator getIterator();
}
