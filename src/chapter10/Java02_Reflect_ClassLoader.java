package chapter10;

/**
 * ClassName: Java01_Reflect
 * Description:
 *
 * @Author 許記源
 * @Create 2025/4/2 下午 01:26
 * @Version 1.0
 */
public class Java02_Reflect_ClassLoader {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
        //TODO 反射 類加載器
        // Java中的類加載分類：
        // 1. Java核心類庫的類: String, Object
        // 2. JVM 擴展平台的類
        // 3. 自己寫的類: User, Child
        // 類加載器也分3種
        // 1. BootClassLoader : 啟動類加載器 (操作系統平台語言實現)加載JAVA核心類 rt.jar
        // 2. PlatformClassLoader : 平台類加載器(加載 JDK 的平台類和第三方標準類庫)
        // 3. AppClassLoader : 應用類加載器

        Class<Student> studentClass = Student.class;
        System.out.println(studentClass.getClassLoader());//AppClassLoader
        System.out.println(studentClass.getClassLoader().getParent());//ExtClassLoader JDK9後改成PlatformClassLoader


    }


}
class Student {

}

