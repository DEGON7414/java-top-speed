package chapter03;

import java.util.Iterator;

public class Java06_FlowControl_TEST {
    public static void main(String[] args) {
    	//TODO 九層妖塔 - 練習
    	/*
    	 	*
    	   ***
    	  *****
    	
    	  */
    	/*一層一層打印法
    	//打印第一層數據
    	for (int i = 0; i <1 ; i++) {
			System.out.print("*");
		}
    	System.out.println("");
    	//ln 自動換行
    	//print 不換
    	//打印第二層
    	for (int i = 0; i <3 ; i++) {
			System.out.print("*");
		}
    	System.out.println("");
    	//打印第三層
    	for (int i = 0; i <5 ; i++) {
			System.out.print("*");
		}
    	System.out.println("");
    	//打印第四層
    	for (int i = 0; i <7 ; i++) {
			System.out.print("*");
		}
    	System.out.println("");
    	*/
    	
    	//j 是當前層數 從0開始算
    	/*
    	 打印空格 總層數-當前層數
    	 
    	 */
    	int level = 9;//總層數
    	
    	for (int j = 0; j < level; j++) {
    							//先-1 因為要從0開始算
    		for (int i = 0; i <(level-1)-j ; i++) {
    			System.out.print(" ");
    							//星星規律 當前層數*2+1 從0算
    		}for (int i = 0; i <j * 2 +1 ; i++) {
    			System.out.print("*");
    		}
        	System.out.println("");

		}
    	
    	
           }
    }