package ac.design.reactor.impl;

import ac.design.reactor.Subscriber;
import ac.design.reactor.Subscription;

/**
 * @author AiCui
 * @date 2023/5/30 15:58
 */
public class ArraySubscription<T> implements Subscription {
    private final Subscriber<T> subscriber;
    private final T[] array;
    private boolean cancel;

    public ArraySubscription(Subscriber<T> subscriber, T[] array) {
        this.subscriber = subscriber;
        this.array = array;
    }

    @Override
    public void request(long n) {
        if (cancel) {
            return;
        }
        try {
            for (int i = 0; i < array.length; i++) {
                subscriber.onNext(array[i]);
            }
            subscriber.onComplete();
        } catch (Exception e) {
            subscriber.onError(e);
        }
    }

    @Override
    public void cancel() {
        this.cancel = true;
    }
}
