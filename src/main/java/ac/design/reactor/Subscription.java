package ac.design.reactor;

/**
 * @author AiCui
 * @date 2023/5/30 15:33
 */
public interface Subscription {

    void request(long n);

    void cancel();
}
