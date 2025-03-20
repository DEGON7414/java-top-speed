package chapter05;

import java.util.Arrays;

public class Java03_Object {
    public static void main(String[] args) {
        //TODO 二維陣列
        //1. 直接賦值
        String [][]name ={{"喇叭間","幫你間","布魯斯間"},{"喇叭間","幫你間"},{"喇叭間"}};
        //二維的要用deepToString
        System.out.println(Arrays.deepToString(name));
        //2.先指定長度
        String[][] names = new String[3][2];
        names[0][1] = "NARUTO";
        for (int row = 0; row < names.length; row++) {
            for (int col = 0; col < names[row].length; col++) {
                System.out.print(names[row][col]+ " ");
            }
            System.out.println(" ");
        }


    }
}
