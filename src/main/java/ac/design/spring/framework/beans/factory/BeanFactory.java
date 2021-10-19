package ac.design.spring.framework.beans.factory;

/**
 * @Author acemma
 * @Date 2021/10/18 23:13
 * @Description
 */
public interface BeanFactory {

    Object getBean(String beanName) throws Exception;

    <T> T getBean(String beanName, Class<? extends T> clazz) throws Exception;

}
