package ac.design.pattern.singleton;

/**
 * @author acemma
 * @date 2018/12/21 15:42
 * @Description 双重锁懒汉模式(Double Check Lock)
 * DCL模式的优点就是，只有在对象需要被使用时才创建，第一次判断 INSTANCE == null为了避免非必要加锁，
 * 当第一次加载时才对实例进行加锁再实例化。这样既可以节约内存空间，又可以保证线程安全。
 * 但是，由于jvm存在乱序执行功能，DCL也会出现线程不安全的情况。
 * 转载自 https://blog.csdn.net/mnb65482/article/details/80458571
 */
public class DoubleLockPattern {

    private static DoubleLockPattern INSTANCE = null;

    private DoubleLockPattern(){}

    public static DoubleLockPattern getInstance(){
        if (INSTANCE == null){
            synchronized (DoubleLockPattern.class){
                if (INSTANCE == null){
                    INSTANCE = new DoubleLockPattern();
                }
            }
        }
        return INSTANCE;
    }

}
