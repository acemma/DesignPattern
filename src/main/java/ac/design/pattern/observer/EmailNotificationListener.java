package ac.design.pattern.observer;

import java.io.File;

/**
 * @author AiCui
 * @date 2022/6/17 16:18
 */
public class EmailNotificationListener implements EventListener{

    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
