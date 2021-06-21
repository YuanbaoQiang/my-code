package github.yuanbaoqiang.proxy.statics;

/**
 * @description: 用户代理类
 * @author: YuanbaoQiang
 * @create: 2021-06-21 20:43
 */
public class UserProxy implements UserService{
    private final UserService userService;

    public UserProxy(UserService userService){
        this.userService = userService;
    }

    @Override
    public void save(String info) {
        System.out.println("开启事务...");
        userService.save(info);
        System.out.println("关闭事务...");
    }
}
