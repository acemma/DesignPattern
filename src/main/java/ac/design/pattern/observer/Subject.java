package ac.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author acemma
 * @Date 2020/10/26 19:38
 * @Description 被观察者的职责
 */
public class Subject {

    private List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyAllObserver() {
        for (Observer observer : observerList) {
            observer.update(this);
        }
    }
}
