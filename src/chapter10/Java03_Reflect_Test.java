package chapter10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ClassName: Java01_Reflect
 * Description:
 *
 * @Author 許記源
 * @Create 2025/4/2 下午 01:26
 * @Version 1.0
 */
public class Java03_Reflect_Test {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //TODO 反射練習
        //獲取類別
        Class<Emp> empClass = Emp.class;
        //獲取建構子
        Constructor<Emp> declaredConstructor = empClass.getDeclaredConstructor();
        //建立物件
        Emp emp = declaredConstructor.newInstance();
        //獲得物件屬性
        Field account = empClass.getField("account");
        Field password = empClass.getField("password");
        //給屬性賦值
        account.set(emp, "兩面");
        password.set(emp, "腦攤");
        //獲取登陸方法
        // 第一個是知道方法名 可以這樣獲得
        Method login = empClass.getMethod("login");
        //第二個getDeclaredMethods 取得該類中所有方法(不含繼承)
        Method[] declaredMethods = empClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method.getName());
        }
        //調用方法
        Object result = login.invoke(emp);
        System.out.println(result);


    }
}
class Emp {
    public String account;
    public String password;

    public boolean login() {
        if ("兩面".equals(account) && "腦攤".equals(password)) {
            return true;
        }
        return false;
    }

}

