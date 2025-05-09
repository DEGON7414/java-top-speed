package chapter05;

public class Java05_Object_Datatype {
    public static void main(String[] args) {
        //TODO 包裝類
        //就是將基本資料形別 包裝成物件 物件化

        //除了 int = inteager char = Character外其他就是 首字大寫
        Byte b = 127;
        Short s = 127;
        Integer i = 127;
        Long l = 127L;
        Float f = 127.0f;
        Double d = 127.0;
        Boolean bool = true;
        Character ch = 'a';

        //TODO 自動裝箱
        int a = 127;
        //1.手動裝箱
        Integer i1 = Integer.valueOf(a);
        // 2.自動裝箱
        Integer i2 = a;
        //TODO自動拆箱
        //3.手動拆箱
        int i3 = i2.intValue();
        //4.自動拆箱
        int i4 = i1;
    }

}