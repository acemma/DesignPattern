package ac.design.pattern.filter;

import java.util.List;

/**
 * @Author acemma
 * @Date 2020/11/30 14:37
 * @Description
 */
public interface Filter {

    List<Person> meetCriteria(List<Person> personList);

}
