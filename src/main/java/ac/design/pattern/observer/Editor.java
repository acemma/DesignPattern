package ac.design.pattern.observer;

import java.io.File;

/**
 * @author AiCui
 * @date 2022/6/17 16:14
 */
public class Editor {

    public EventManager eventManager;
    private File file;

    public Editor() {
        this.eventManager = new EventManager("open", "save");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        eventManager.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            eventManager.notify("save", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }

}
