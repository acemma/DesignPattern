package ac.design.spring.framework.beans.factory.support;

/**
 * @Author acemma
 * @Date 2021/10/18 22:50
 * @Description
 */
public interface BeanDefinitionReader {

    /**
     * 获取注册表
     * @return
     */
    BeanDefinitionRegistry getRegistry();


    /**
     * 加载BeanDefinition
     * @param configLocation
     * @throws Exception
     */
    void loadBeanDefinitions(String configLocation) throws Exception;


}
