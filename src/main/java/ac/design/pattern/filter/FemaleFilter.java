package ac.design.pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author acemma
 * @Date 2020/11/30 14:40
 * @Description 女性过滤器
 */
public class FemaleFilter implements Filter{
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person person : personList) {
            if (person.getGender().equalsIgnoreCase("female")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
