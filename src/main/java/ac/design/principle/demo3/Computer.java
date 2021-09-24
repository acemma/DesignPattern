package ac.design.principle.demo3;

/**
 * @Author acemma
 * @Date 2021/9/15 23:28
 * @Description 计算机类
 */
public class Computer {

    private HardDisk hardDisk;
    private Cpu cpu;
    private Memory memory;

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    /**
     * 启动计算机
     */
    public void start() {
        System.out.println("开始启动计算机");
        String data = hardDisk.getData();
        hardDisk.saveData(data);
        cpu.run();
        memory.save();
    }
}
