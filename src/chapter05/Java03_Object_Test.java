package chapter05;

public class Java03_Object_Test {
    public static void main(String[] args) {
        //TODO 九層妖塔 用 陣列做
        /*
             *
            ***
           *****
          *******
         *********
         */
        int row = 5 ;//總層數
        int col = 2*row-1;//總欄數 空格+*。 2*5-1=9
        String[][] nineTower = new String[row][col];
        //外層 控制總層數
        for(int i = 0; i <row; i++) {
            //當前層數
            for(int j = 0; j < col; j++) {
                //第一個算出星星開始的位置(左邊界) 第二個算出星星結束的位置(右邊界)
                //第一層 j>= (5-1)-0 && j<= (5-1)+0 所以第一層 左邊空4 右邊空4 中間填入星
                //也就是[*]
                if(j >=(row-1)-i && j <=(row-1)+i) {
                    nineTower[i][j]= "*";
                }else{
                    nineTower[i][j]=" ";
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(nineTower[i][j]);
            }
            System.out.println();
        }

    }


}