package ac.design.spring.framework.beans.factory.xml;

import ac.design.spring.framework.beans.BeanDefinition;
import ac.design.spring.framework.beans.MultiPropertyValues;
import ac.design.spring.framework.beans.PropertyValue;
import ac.design.spring.framework.beans.factory.support.BeanDefinitionReader;
import ac.design.spring.framework.beans.factory.support.BeanDefinitionRegistry;
import ac.design.spring.framework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

/**
 * @Author acemma
 * @Date 2021/10/18 22:52
 * @Description
 */
public class XmlBeanDefinitionReader implements BeanDefinitionReader {

    // 注册表对象
    private BeanDefinitionRegistry registry;

    public XmlBeanDefinitionReader() {
        this.registry = new SimpleBeanDefinitionRegistry();
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public void loadBeanDefinitions(String configLocation) throws Exception {

        SAXReader saxReader = new SAXReader();
        // 获取类路径下的配置文件
        InputStream inputStream = XmlBeanDefinitionReader.class.getClassLoader().getResourceAsStream(configLocation);
        Document document = saxReader.read(inputStream);
        Element rootElement = document.getRootElement();
        List<Element> elements = rootElement.elements("bean");
        for (Element element : elements) {
            // 获取id属性
            String id = element.attributeValue("id");
            // 获取class属性
            String className = element.attributeValue("class");
            // 封装到BeanDefinition中
            BeanDefinition beanDefinition = new BeanDefinition();
            beanDefinition.setId(id);
            beanDefinition.setClassName(className);

            MultiPropertyValues multiPropertyValues = new MultiPropertyValues();
            List<Element> propertyElements = element.elements("property");
            for (Element propertyElement : propertyElements) {
                String name = propertyElement.attributeValue("name");
                String ref = propertyElement.attributeValue("ref");
                String value = propertyElement.attributeValue("value");
                PropertyValue propertyValue = new PropertyValue(name, ref, value);
                multiPropertyValues.add(propertyValue);
            }
            beanDefinition.setPropertyValues(multiPropertyValues);

            // 将BeanDefinition注册到注册表中
            registry.registryBeanDefinition(id, beanDefinition);
        }

    }
}
