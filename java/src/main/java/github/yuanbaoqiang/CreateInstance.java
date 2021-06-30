package github.yuanbaoqiang;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @description: 创建对象的几种方式
 * @author: YuanbaoQiang-ctrip
 * @create: 2021-06-30 13:08
 */
public class CreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, IOException, CloneNotSupportedException {
        // 1. new关键字
        People people1 = new People();

        // 2. 使用Class的newInstance方法
        Class<?> aClass = Class.forName("github.yuanbaoqiang.People");
        People people2 = (People) aClass.newInstance();
        // 或者 People people2 = People.class.newInstance();

        // 3. 使用Constructor类的newInstance方法
        // 获取其无参构造器
        Constructor<People> constructorWithNoParams = People.class.getConstructor();
        People people3 = constructorWithNoParams.newInstance();
        // 获取其有参构造器
        Constructor<People> constructorWithParams = People.class.getConstructor(String.class, Boolean.class);
        People people4 = constructorWithParams.newInstance("test", true);

        // 4. clone()方法
        // 目标类需要实现Serializable接口
        People people5 = (People) people1.clone();

        // 5. 使用反序列化
        // 目标类需要实现Cloneable接口
        // 序列化
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(new People());
        oos.flush();
        oos.close();
        // 反序列化
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        People people6 = (People) ois.readObject();

    }

}

class People implements Cloneable, Serializable{

    private static final long serialVersionUID = 669533457736493L;
    private String name;
    private Boolean sex;

    public People() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public People(String name, Boolean sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }
}