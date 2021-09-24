package ac.design.principle.demo3;

/**
 * @Author acemma
 * @Date 2021/9/15 23:30
 * @Description 依赖倒转原则--高层模块不应依赖低层模块，两者都应该依赖其抽象；抽象不应该依赖细节，细节应该依赖抽象；
 */
public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer();
        HardDisk hardDisk = new XiJieHardDisk();
        Cpu cpu = new IntelCpu();
        Memory memory = new KingstonMemory();
        computer.setHardDisk(hardDisk);
        computer.setCpu(cpu);
        computer.setMemory(memory);

        computer.start();
    }

}
