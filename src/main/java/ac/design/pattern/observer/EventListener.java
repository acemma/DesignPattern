package ac.design.pattern.observer;

import java.io.File;

/**
 * 事件监听者
 *
 * @author AiCui
 * @date 2022/6/17 16:07
 */
public interface EventListener {

    void update(String eventType, File file);
}
