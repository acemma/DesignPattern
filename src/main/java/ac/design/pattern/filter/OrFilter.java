package ac.design.pattern.filter;

import java.util.List;

/**
 * @Author acemma
 * @Date 2020/11/30 14:45
 * @Description
 */
public class OrFilter implements Filter{

    private Filter filter;
    private Filter otherFilter;

    public OrFilter(Filter filter, Filter otherFilter) {
        this.filter = filter;
        this.otherFilter = otherFilter;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstFilterPersons = filter.meetCriteria(personList);
        List<Person> otherFilterPersons = otherFilter.meetCriteria(personList);
        for (Person person : otherFilterPersons) {
            if (!firstFilterPersons.contains(person)) {
                firstFilterPersons.add(person);
            }
        }
        return firstFilterPersons;
    }
}
