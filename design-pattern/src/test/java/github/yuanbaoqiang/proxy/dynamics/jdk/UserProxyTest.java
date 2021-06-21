package github.yuanbaoqiang.proxy.dynamics.jdk;

import org.junit.Test;

/**
 * @description: 动态代理测试
 * @author: YuanbaoQiang
 * @create: 2021-06-21 21:16
 */
public class UserProxyTest {

    @Test
    public void save(){
        UserService userService = (UserService) JdkProxyFactory.getProxy(new UserServiceImpl());
        userService.save1();
        System.out.println("===========================");
        userService.save2();
    }
}
