package ac.design.reactor.impl;

import ac.design.reactor.Subscriber;
import ac.design.reactor.Subscription;

/**
 * @author AiCui
 * @date 2023/5/30 16:04
 */
public class SubscriberImpl<T> implements Subscriber<T> {

    private Subscription subscription;


    @Override
    public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;
        subscription.request(Long.MAX_VALUE);
    }

    @Override
    public void onNext(T s) {
        System.out.println("接收到了元素：" + s);
        if (s.equals("error")) {
            throw new RuntimeException("消费到异常数据");
        }
    }

    @Override
    public void onError(Throwable t) {
        System.out.println("接收到了异常信号：" + t.getMessage());
    }

    @Override
    public void onComplete() {
        System.out.println("接收到了完成信号");
    }

    public Subscription getSubscription() {
        return subscription;
    }
}
