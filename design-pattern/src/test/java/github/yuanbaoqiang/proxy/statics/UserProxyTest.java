package github.yuanbaoqiang.proxy.statics;

import org.junit.jupiter.api.Test;

/**
 * @description: 静态代理测试
 * @author: YuanbaoQiang
 * @create: 2021-06-21 20:51
 */
public class UserProxyTest {

    @Test
    public void save(){
        UserProxy userProxy = new UserProxy(new UserServiceImpl());
        userProxy.save("name: xxxx, age: xxx...");
    }
}
