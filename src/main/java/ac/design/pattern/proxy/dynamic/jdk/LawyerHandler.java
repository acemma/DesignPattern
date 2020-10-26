package ac.design.pattern.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author acemma
 * @Date 2020/10/22 16:26
 * @Description 代理对象 接收一个主题
 */
public class LawyerHandler  implements InvocationHandler {
    private Action action;

    //绑定代理对象
    public Action bind(Action action) {
        this.action = action;
        //保存JDK动态代理字节码文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        return (Action) Proxy.newProxyInstance(action.getClass().getClassLoader(),  action.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用被代理对象的方法
        Object obj = method.invoke(action, args);
        System.out.println("律师处理委托人的需求");
        return obj;
    }
}
