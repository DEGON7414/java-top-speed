package chapter03;

import java.util.Iterator;

public class Java05_FlowControl_2 {
    public static void main(String[] args) {
    	//TODO 流程控制 重複執行 break continue
//    	for (int i = 0; i < 10; i++) {
//    		if(i == 4) {
//    			
//    		}else {
//				System.out.println(i);
//			}
//			
//		}
    	
    	//break contunue
    	for (int i = 0; i < 10; i++) {
    		if(i == 4) {
    			//切斷 跳出循環
    			//break; 
    			//0123
    			//跳過當前循環 執行下一次
    			continue;
    			//012356789
    		}else {
				System.out.println(i);
			}
			
		}
    	
           }
    }