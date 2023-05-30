package ac.design.reactor.impl;

import ac.design.reactor.Publisher;
import ac.design.reactor.Subscriber;

/**
 * @author AiCui
 * @date 2023/5/30 15:56
 */
public class ArrayPublisher<T> implements Publisher<T> {

    private final T[] array;

    public ArrayPublisher(T[] array) {
        this.array = array;
    }

    @Override
    public void subscribe(Subscriber<? super T> subscriber) {
        subscriber.onSubscribe(new ArraySubscription<>(subscriber, array));
    }


    public T[] getArray() {
        return array;
    }
}
