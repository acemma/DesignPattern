package ac.design.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author acemma
 * @Date 2021/9/26 22:44
 * @Description 服务员-充当命令调用者
 */
public class Waitress {

    private List<Command> commands = new ArrayList<>();

    public List<Command> getCommands() {
        return commands;
    }

    public void setCommands(Command command) {
        commands.add(command);
    }

    public void orderUp() {
        System.out.println("美女服务员说：大厨，新订单来了！");
        commands.forEach(Command::execute);
    }
}
