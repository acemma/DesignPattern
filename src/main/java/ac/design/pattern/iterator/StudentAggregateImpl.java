package ac.design.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author acemma
 * @Date 2021/9/27 22:14
 * @Description
 */
public class StudentAggregateImpl implements StudentAggregate{

    private List<Student> list = new ArrayList<>();

    @Override
    public void add(Student student) {
        list.add(student);
    }

    @Override
    public void remove(Student student) {
        list.remove(student);
    }

    @Override
    public StudentIterator getIterator() {
        return new StudentIteratorImpl(list);
    }
}
