package ac.design.reactor;

/**
 * @author AiCui
 * @date 2023/5/30 15:32
 */
public interface Subscriber<T> {

    void onSubscribe(Subscription subscription);

    void onNext(T t);

    void onError(Throwable e);

    void onComplete();
}
