package chapter10;

import java.lang.reflect.*;

public class Java01_Reflect {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //TODO 反射 取得類資訊
        //使用取得 類的資訊來構建物件、實作方法、修改屬性
        //TODO使用步驟
        //1.獲取Class物件 兩種都可以 推薦上面 好記
        Class<User> userClass1 = User.class;
//        Class<?> userClass = Class.forName("User");
        //2.創建User 物件 取得建構子 newInstance方法相當於new
        Object object = userClass1.getDeclaredConstructor().newInstance();
        //3.獲取並修改屬性
        Field field1 = userClass1.getField("name");
        field1.set(object,"ANDY");
        //4.獲取並呼叫方法
        Method login = userClass1.getMethod("login");
        login.invoke(object);


        User user = new User();
        //取得類
        Class<? extends User> aClass = user.getClass();
        //類完整名(含包名)
        System.out.println(aClass.getClass().getName());
        //類名
        System.out.println(aClass.getClass().getSimpleName());
        //取得包名
        System.out.println(aClass.getClass().getPackage());

        //取得類的父親
        Class<?> superclass = aClass.getSuperclass();
        System.out.println(superclass);
        //獲取類的接口
        Class<?>[] interfaces = aClass.getInterfaces();
        System.out.println(interfaces.length);
        //獲得類的屬性
        Field field = aClass.getField("XXX");//取得公開的 (含父類)
        System.out.println(field);
        Field xxx = aClass.getDeclaredField("XXX");//取得所有(public private)但沒有繼承的父類
        System.out.println(xxx);
        //獲得類的方法
        Method test = aClass.getMethod("test");//公開
        Method xxx1 = aClass.getDeclaredMethod("XXX");//所有

        Method[] methods = aClass.getMethods();
        Method[] declaredMethods = aClass.getDeclaredMethods();
        //獲得建構子
        Constructor<? extends User> constructor = aClass.getConstructor();
        Constructor<?>[] constructors = aClass.getConstructors();
        aClass.getDeclaredConstructor();
        //獲取權限 多個權限會融合成INT
        int modifiers = aClass.getModifiers();
        boolean aPrivate = Modifier.isPrivate(modifiers);


    }


}

class User {
    public String name;
    public void test() {
        System.out.println("test");
    }
}