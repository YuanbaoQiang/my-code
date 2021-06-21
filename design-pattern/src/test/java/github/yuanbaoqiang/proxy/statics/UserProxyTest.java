package github.yuanbaoqiang.proxy.statics;

import org.junit.jupiter.api.Test;

import javax.jws.soap.SOAPBinding;

/**
 * @description: 静态代理测试
 * @author: YuanbaoQiang
 * @create: 2021-06-21 20:51
 */
public class UserProxyTest {

    @Test
    public void save(){
        UserProxy userProxy = new UserProxy(new UserImpl());
        userProxy.save("name: xxxx, age: xxx...");
    }
}
