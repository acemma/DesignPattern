package ac.design.spring.framework.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author acemma
 * @Date 2021/10/14 22:35
 * @Description 用来存储多个property属性
 */
public class MultiPropertyValues implements Iterable<PropertyValue>{

    private final List<PropertyValue> propertyValueList;

    public MultiPropertyValues() {
        this.propertyValueList = new ArrayList<>();
    }

    public MultiPropertyValues(List<PropertyValue> propertyValueList) {
        if (null == propertyValueList) {
            this.propertyValueList = new ArrayList<>();
        } else {
            this.propertyValueList = propertyValueList;
        }
    }

    // 获取所有的PropertyValue
    public PropertyValue[] getPropertyValues() {
        return propertyValueList.toArray(new PropertyValue[0]);
    }

    // 根据name属性值获取PropertyValue对象
    public PropertyValue getPropertyValue(String propertyName) {
        // 遍历集合
        for (PropertyValue propertyValue : propertyValueList) {
            if (propertyValue.getName().equals(propertyName)) {
                return propertyValue;
            }
        }
        return null;
    }

    // 判断是否为空
    public boolean isEmpty() {
        return propertyValueList.isEmpty();
    }

    // 添加PropertyValue对象
    public MultiPropertyValues add(PropertyValue propertyValue) {
        // 判断集合中是否已存在，存在则覆盖
        for (int i = 0; i < propertyValueList.size(); i++) {
            if (propertyValue.getName().equals(propertyValueList.get(i).getName())) {
                propertyValueList.set(i, propertyValue);
                return this;
            }
        }
        propertyValueList.add(propertyValue);
        return this;
    }

    // 判断是否包含
    public boolean contains(String propertyName) {
        return null != getPropertyValue(propertyName);
    }


    // 获取迭代器对象
    @Override
    public Iterator<PropertyValue> iterator() {
        return propertyValueList.iterator();
    }


}
