package github.yuanbaoqiang.proxy.statics;

/**
 * @description: 用户服务实现类
 * @author: YuanbaoQiang
 * @create: 2021-06-21 20:40
 */
public class UserServiceImpl implements UserService{
    @Override
    public void save(String info) {
        System.out.println("存储用户的信息: " + info);
    }
}
