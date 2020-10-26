package ac.design.pattern.builder;

/**
 * @Author acemma
 * @Date 2020/10/26 20:11
 * @Description 产品类
 */
public class Computer {

    /**
     * 显示器
     */
    private String monitor;

    /**
     * 机箱
     */
    private String box;

    /**
     * 键盘
     */
    private String keyboard;

    /**
     * 鼠标
     */
    private String mouse;

    public Computer() {
    }

    public Computer(Builder builder) {
        this.monitor = builder.monitor;
        this.box = builder.box;
        this.keyboard = builder.keyboard;
        this.mouse = builder.mouse;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "monitor='" + monitor + '\'' +
                ", box='" + box + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", mouse='" + mouse + '\'' +
                '}';
    }

    /**
     * 内部建造类
     */
    static class Builder {
        /**
         * 显示器
         */
        private String monitor;

        /**
         * 机箱
         */
        private String box;

        /**
         * 键盘
         */
        private String keyboard;

        /**
         * 鼠标
         */
        private String mouse;


        public Builder monitor(String monitor) {
            this.monitor = monitor;
            return this;
        }

        public Builder box(String box) {
            this.box = box;
            return this;
        }

        public Builder keyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Builder mouse(String mouse) {
            this.mouse = mouse;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }


}
