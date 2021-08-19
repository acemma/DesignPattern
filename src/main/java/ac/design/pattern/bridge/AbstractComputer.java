package ac.design.pattern.bridge;

/**
 * @Author acemma
 * @Date 2021/8/19 14:06
 * @Description
 */
public abstract class AbstractComputer {

    protected Brand brand;

    public void info() {
        brand.info();
    };

    public AbstractComputer(Brand brand) {
        this.brand = brand;
    }
}

class Desktop extends AbstractComputer {

    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("台式机");
    }
}

class Laptop extends AbstractComputer {


    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("笔记本");
    }
}

class Pad extends AbstractComputer {

    public Pad(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("平板电脑");
    }
}
