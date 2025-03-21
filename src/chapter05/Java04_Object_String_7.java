package chapter05;

public class Java04_Object_String_7 {
    public static void main(String[] args) {
       //TODO StringBuilder
        //stringbuilder 構建String []
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        System.out.println(stringBuilder.toString());
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.insert(0,"CCC"));
    }

}