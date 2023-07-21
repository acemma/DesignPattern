package ac.design.reactor;

import ac.design.reactor.impl.ArrayPublisher;
import ac.design.reactor.impl.SubscriberImpl;

/**
 * @author AiCui
 * @date 2023/5/30 16:17
 */
public class ReactorTest {

    public static void main(String[] args) {
        Publisher<String> publisher = new ArrayPublisher<>(new String[] {"a", "b", "c", "d", "error", "h"});
        publisher.subscribe(new SubscriberImpl<>());
    }

}
