package ac.design.spring.framework.beans.factory.support;

import ac.design.spring.framework.beans.BeanDefinition;

/**
 * @Author acemma
 * @Date 2021/10/14 23:03
 * @Description
 */
public interface BeanDefinitionRegistry {

    /**
     * 注册BeanDefinition
     * @param beanName
     * @param beanDefinition
     */
    void registryBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * 移除BeanDefinition
     * @param beanName
     * @throws Exception
     */
    void removeBeanDefinition(String beanName) throws Exception;

    /**
     * 根据名称获取BeanDefinition对象
     * @param beanName
     * @return
     * @throws Exception
     */
    BeanDefinition getBeanDefinition(String beanName) throws Exception;

    /**
     * 判断是否含有BeanDefinition对象
     * @param beanName
     * @return
     */
    boolean containsBeanDefinition(String beanName);

    /**
     * 获取BeanDefinition数量
     * @return
     */
    int getBeanDefinitionCount();


    /**
     * 获取所有的BeanDefinition名称
     * @return
     */
    String[] getBeanDefinitionNames();
}
