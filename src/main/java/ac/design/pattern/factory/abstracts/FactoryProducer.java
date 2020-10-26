package ac.design.pattern.factory.abstracts;

/**
 * @Author acemma
 * @Date 2020/10/26 13:45
 * @Description
 */
public class FactoryProducer {

    public static AbstractPcFactory getFactory(Class<? extends AbstractPcFactory> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;

    }

}
