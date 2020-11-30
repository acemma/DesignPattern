package ac.design.pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author acemma
 * @Date 2020/11/30 14:50
 * @Description 过滤器模式
 */
public class FilterPatternTest {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Robert","Male", "Single"));
        personList.add(new Person("John","Male", "Married"));
        personList.add(new Person("Laura","Female", "Married"));
        personList.add(new Person("Diana","Female", "Single"));
        personList.add(new Person("Mike","Male", "Single"));
        personList.add(new Person("Bobby","Male", "Single"));

        Filter maleFilter = new MaleFilter();
        Filter femaleFilter = new FemaleFilter();
        Filter singleFilter = new SingleFilter();
        Filter singleMaleFilter = new AndFilter(singleFilter, maleFilter);
        Filter singleOrFemaleFiler = new OrFilter(singleFilter, femaleFilter);

        System.out.println("male persons:");
        printPersons(maleFilter.meetCriteria(personList));

        System.out.println("\nfemale persons:");
        printPersons(femaleFilter.meetCriteria(personList));

        System.out.println("\nsingle persons:");
        printPersons(singleFilter.meetCriteria(personList));

        System.out.println("\nsingle and male persons:");
        printPersons(singleMaleFilter.meetCriteria(personList));

        System.out.println("\nsingle or female persons:");
        printPersons(singleOrFemaleFiler.meetCriteria(personList));


    }

    public static void printPersons(List<Person> persons) {
        persons.forEach(System.out::println);
    }

}
