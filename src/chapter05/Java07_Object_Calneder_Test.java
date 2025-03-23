package chapter05;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

public class Java07_Object_Calneder_Test {
    public static void main(String[] args) throws ParseException {
     //TODO 日期類
    	//打印當前日曆
    	System.out.println("周一\t周二\t周三\t周四\t周五\t周六\t周日");
    	//獲取當前日期的日曆物件 靜態方法
    	Calendar firstDate = Calendar.getInstance();
    	//把日曆對象設定為當前月的第一天 // 03-01
    	firstDate.set(Calendar.DAY_OF_MONTH,1);
    	int maxDay = firstDate.getActualMaximum(Calendar.DAY_OF_MONTH);
    	for (int i = 0; i < maxDay; i++) {
    		//當前日期是周幾
    		int weekX = firstDate.get(Calendar.DAY_OF_WEEK);
    		//當前日期是幾號
    		int monthY = firstDate.get(Calendar.DAY_OF_MONTH);
    		if(i == 0 ) {
    			if (weekX == Calendar.SUNDAY) {
					for (int j = 0; j < 6; j++) {
						System.out.print("\t");
					}
					System.out.println(monthY);
				}else {
					//周日是1 周一是2 週六是7
					for (int j = 0; j < weekX -2; j++) {
						System.out.print("\t");
					}
					System.out.print(monthY);
					System.out.print("\t");
				}
    		}else {
    			//不是一號的場合
    			if(weekX == Calendar.SUNDAY) {
    				System.out.println(monthY);
    			}else {
    				System.out.print(monthY);
    				System.out.print("\t");
    			}
    		}
    		firstDate.add(Calendar.DATE, 1);
			
		}

    }

}