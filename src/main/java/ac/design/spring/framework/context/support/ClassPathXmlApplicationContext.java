package ac.design.spring.framework.context.support;

import ac.design.spring.framework.beans.BeanDefinition;
import ac.design.spring.framework.beans.MultiPropertyValues;
import ac.design.spring.framework.beans.PropertyValue;
import ac.design.spring.framework.beans.factory.support.BeanDefinitionRegistry;
import ac.design.spring.framework.beans.factory.xml.XmlBeanDefinitionReader;
import ac.design.spring.framework.utils.StringUtils;

import java.lang.reflect.Method;

/**
 * @Author acemma
 * @Date 2021/10/18 23:32
 * @Description
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext {

    public ClassPathXmlApplicationContext(String configLocation) {
        this.configLocation = configLocation;
        this.beanDefinitionReader = new XmlBeanDefinitionReader();
        try {
            this.refresh();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object getBean(String beanName) throws Exception {
        Object obj = this.singletonObjects.get(beanName);
        if (null == obj) {
            BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
            BeanDefinition beanDefinition = registry.getBeanDefinition(beanName);

            String className = beanDefinition.getClassName();
            // 通过反射创造对象
            Class<?> clazz = Class.forName(className);
            Object beaObj = clazz.newInstance();
            // 依赖注入
            MultiPropertyValues propertyValues = beanDefinition.getPropertyValues();
            for (PropertyValue propertyValue : propertyValues) {
                String name = propertyValue.getName();
                String ref = propertyValue.getRef();
                String value = propertyValue.getValue();
                if (null != ref && !"".equals(ref)) {
                    // 获取依赖的bean
                    Object bean = getBean(ref);
                    String methodName = StringUtils.getSetterMethodByFieldName(name);
                    // 获取所有的方法
                    Method[] methods = clazz.getMethods();
                    for (Method method : methods) {
                        if (method.getName().equals(methodName)) {
                            // 执行set方法
                            method.invoke(beaObj, bean);
                        }
                    }
                }
                if (null != value && !"".equals(value)) {
                    String methodName = StringUtils.getSetterMethodByFieldName(name);
                    Method method = clazz.getMethod(methodName, String.class);
                    method.invoke(beaObj, value);
                }
            }
            singletonObjects.put(beanName, beaObj);
            return beaObj;
        }
        return obj;
    }


    public <T> T getBean(String beanName, Class<? extends T> clazz) throws Exception {
        Object bean = getBean(beanName);
        if (null == bean) {
            return null;
        }
        return clazz.cast(bean);
    }
}
