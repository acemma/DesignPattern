package ac.design.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author acemma
 * @Date 2021/9/29 22:35
 * @Description
 */
public class Home {

    private List<Animal> nodeList = new ArrayList<>();

    public void accept(Person person) {
        nodeList.forEach(animal -> {
            animal.accept(person);
        });
    }

    public void addAnimal(Animal animal) {
        nodeList.add(animal);
    }

}
