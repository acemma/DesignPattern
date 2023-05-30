package ac.design.pattern.observer;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 事件管理中心
 *
 * @author AiCui
 * @date 2022/6/17 16:06
 */
public class EventManager {

    private Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... events) {
        for (String event : events) {
            this.listeners.put(event, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> eventListeners = listeners.get(eventType);
        eventListeners.add(listener);
    }

    public void unSubscribe(String eventType, EventListener listener) {
        List<EventListener> eventListeners = listeners.get(eventType);
        eventListeners.remove(listener);
    }

    public void notify(String eventType, File file) {
        List<EventListener> eventListeners = listeners.get(eventType);
        for (EventListener listener : eventListeners) {
            listener.update(eventType, file);
        }
    }

}
