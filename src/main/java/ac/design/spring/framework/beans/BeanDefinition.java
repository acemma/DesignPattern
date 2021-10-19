package ac.design.spring.framework.beans;

/**
 * @Author acemma
 * @Date 2021/10/14 22:59
 * @Description 用来封装bean标签
 */
public class BeanDefinition {

    private String id;
    private String className;
    private MultiPropertyValues propertyValues;

    public BeanDefinition() {
        propertyValues = new MultiPropertyValues();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public MultiPropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(MultiPropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
