package ac.design.reactor;

/**
 * @author AiCui
 * @date 2023/5/30 15:54
 */
public interface Processor<T, R> extends Subscriber<T>, Publisher<R>{
}
