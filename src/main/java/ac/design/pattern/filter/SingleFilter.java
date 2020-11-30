package ac.design.pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author acemma
 * @Date 2020/11/30 14:42
 * @Description 单身过滤器
 */
public class SingleFilter implements  Filter{
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : personList) {
            if (person.getMaritalStatus().equalsIgnoreCase("single")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
