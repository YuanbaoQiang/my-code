package github.yuanbaoqiang.proxy.dynamics.jdk;

/**
 * @description: 用户服务实现类
 * @author: YuanbaoQiang
 * @create: 2021-06-21 20:40
 */
public class UserServiceImpl implements UserService {
    @Override
    public void save1() {
        System.out.println("调用save1方法");
    }

    @Override
    public void save2() {
        System.out.println("调用save2方法");
    }
}
