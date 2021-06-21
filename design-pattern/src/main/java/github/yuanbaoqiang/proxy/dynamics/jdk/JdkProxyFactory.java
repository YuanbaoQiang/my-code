package github.yuanbaoqiang.proxy.dynamics.jdk;

import java.lang.reflect.Proxy;

/**
 * @description: 获取JDK动态代理对象的工厂
 * @author: YuanbaoQiang
 * @create: 2021-06-21 21:07
 */
public class JdkProxyFactory {
    public static Object getProxy(Object target){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new MyInvocationHandler(target)
        );
    }
}
