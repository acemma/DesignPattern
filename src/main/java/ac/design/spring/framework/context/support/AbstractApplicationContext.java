package ac.design.spring.framework.context.support;

import ac.design.spring.framework.beans.BeanDefinition;
import ac.design.spring.framework.beans.factory.support.BeanDefinitionReader;
import ac.design.spring.framework.beans.factory.support.BeanDefinitionRegistry;
import ac.design.spring.framework.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author acemma
 * @Date 2021/10/18 23:19
 * @Description
 */
public abstract class  AbstractApplicationContext implements ApplicationContext {

    // 声明解析器
    protected BeanDefinitionReader beanDefinitionReader;

    // 声明bean对象容器
    protected Map<String, Object> singletonObjects = new HashMap<>();

    // 声明配置文件路径
    protected String configLocation;

    public void refresh() throws Exception {
        beanDefinitionReader.loadBeanDefinitions(configLocation);
        // 初始化bean
        initBean();
    }

    private void initBean() throws Exception {
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        String[] beanDefinitionNames = registry.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            BeanDefinition beanDefinition = registry.getBeanDefinition(beanDefinitionName);
            getBean(beanDefinition.getId());
        }
    }
}
