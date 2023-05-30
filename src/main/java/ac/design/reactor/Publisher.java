package ac.design.reactor;

/**
 * @author AiCui
 * @date 2023/5/30 15:32
 */
public interface Publisher<T> {

    void subscribe(Subscriber<? super T> subscriber);

}
