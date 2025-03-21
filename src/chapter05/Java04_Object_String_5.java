package chapter05;

public class Java04_Object_String_5 {
    public static void main(String[] args) {
       //TODO String 轉換大小寫
        String s = "Gojo satorU";
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        String s1 = s.substring(0,1);//g
        String s2 = s.substring(1);//ojo satorU
        System.out.println(s1);
        System.out.println(s2.toLowerCase());
        System.out.println(s1.toLowerCase()+s2.toLowerCase());


    }

}