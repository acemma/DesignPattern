package ac.design.pattern.singleton;

/**
 * @author acemma
 * @date 2018/12/21 15:57
 * @Description 枚举模式
 * 枚举在java中与普通类一样，都能拥有字段与方法，而且枚举实例创建是线程安全的，在任何情况下，它都是一个单例。
 * 我们可直接以EnumPattern.INSTANCE的方式调用。
 */
public enum EnumPattern {

    INSTANCE;

    public void method(){
        //TODO
    }

}
