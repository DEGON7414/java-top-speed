package chapter05;

public class Java04_Object_String_7 {
    public static void main(String[] args) {
        //TODO StringBuilder
        //stringbuilder 構建String []
        StringBuilder stringBuilder = new StringBuilder();
        //1.增 拼接
        stringBuilder.append("Hello");
        stringBuilder.append(" ");
        stringBuilder.append("World");
        //2.輸出
        System.out.println(stringBuilder);
        //3.字串長度
        System.out.println(stringBuilder.length());
        //4.相反
        System.out.println(stringBuilder.reverse());
        //5.插入
        System.out.println(stringBuilder.insert(0, "CCC"));
    }

}