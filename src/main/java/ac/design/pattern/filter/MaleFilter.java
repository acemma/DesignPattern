package ac.design.pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author acemma
 * @Date 2020/11/30 14:37
 * @Description 男性过滤器
 */
public class MaleFilter implements Filter{
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : personList) {
            if (person.getGender().equalsIgnoreCase("male")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
