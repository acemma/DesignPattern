package ac.design.pattern.filter;

import java.util.List;

/**
 * @Author acemma
 * @Date 2020/11/30 14:43
 * @Description 条件组合过滤器
 */
public class AndFilter implements Filter{

    private Filter filter;
    private Filter otherFilter;

    public AndFilter(Filter filter, Filter otherFilter) {
        this.filter = filter;
        this.otherFilter = otherFilter;
    }


    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstFilterPersons = filter.meetCriteria(personList);
        return otherFilter.meetCriteria(firstFilterPersons);
    }
}
