package ac.design.spring.framework.context;

import ac.design.spring.framework.beans.factory.BeanFactory;

/**
 * @Author acemma
 * @Date 2021/10/18 23:16
 * @Description
 */
public interface ApplicationContext extends BeanFactory {

    void  refresh() throws Exception;
}
