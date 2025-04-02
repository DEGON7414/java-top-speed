package chapter05;

import java.util.Arrays;

public class Java03_Object {
    public static void main(String[] args) {
        //TODO 二維陣列
        //測試 1  兩種建立方式 1.直接賦值2.定義長度
        //測試2 deepToString for迴圈取出行列

        //1. 直接賦值
        String [][]name ={{"喇叭間","幫你間","布魯斯間"},{"喇叭間","幫你間"},{"喇叭間"}};
        //二維的要用deepToString
        System.out.println(Arrays.deepToString(name));
        //記憶體地址
//        System.out.println(Arrays.toString(name));
        //2.先指定長度
        String[][] names = new String[3][2];
        names[0][1] = "NARUTO";
        //外層row 是橫向 列
        for (int row = 0; row < names.length; row++) {
            //內層 行
            for (int col = 0; col < names[row].length; col++) {
                System.out.print(names[row][col]+ " ");
            }
            System.out.println(" ");
        }


    }
}
