package ac.design.pattern.iterator;

/**
 * @Author acemma
 * @Date 2021/9/27 22:19
 * @Description 迭代器模式
 *
 */
public class Client {

    public static void main(String[] args) {
        StudentAggregate studentAggregate = new StudentAggregateImpl();
        studentAggregate.add(new Student("陈一", 1));
        studentAggregate.add(new Student("钱二", 2));
        studentAggregate.add(new Student("张三", 3));
        studentAggregate.add(new Student("李四", 4));
        studentAggregate.add(new Student("王五", 5));
        studentAggregate.add(new Student("赵六", 6));

        StudentIterator iterator = studentAggregate.getIterator();
        while (iterator.hasNext()) {
            Student next = iterator.next();
            System.out.println(next.toString());
        }
    }
}
