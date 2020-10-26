package ac.design.pattern.proxy.dynamic.cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author acemma
 * @Date 2020/10/23 15:30
 * @Description
 */
public class LawyerInterceptor implements MethodInterceptor {

    private Object object;

    public Object getInstance(Object object) {
        this.object = object;
//        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy", new Class[]{LawyerInterceptor.class});
//        try (FileOutputStream fos = new FileOutputStream(new File("E:\\homework\\DesignPattern\\com\\sun\\proxy\\$Proxy.class"))) {
//            fos.write(bytes);
//            fos.flush();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "E:\\homework\\DesignPattern\\com\\sun\\proxy");

        //Cglib中的加强器，用来创建动态代理
        Enhancer enhancer = new Enhancer();
        //设置代理的父类
        enhancer.setSuperclass(this.object.getClass());
        //设置回调，这里相当于是对于代理类上所有方法的调用，都会调用Callback，而Callback则需要实现intercept()方法进行拦截
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        Object object = proxy.invokeSuper(obj, args);
        System.out.println("律师处理委托人的需求");
        return object;
    }
}
