package ac.design.pattern.proxy.statics;

/**
 * @author acemma
 * @date 2018/12/5 11:19
 * @Description 代理主体
 */
public class ProxySubject implements Subject {

    private Subject subject;

    public ProxySubject(Subject subject){
        this.subject = subject;
    }


    @Override
    public void eat() {
        this.cook();
        this.subject.eat();
        this.wash();
    }

    private void cook(){
        System.out.println("做饭");
    }

    private void wash(){
        System.out.println("洗婉");
    }
}
