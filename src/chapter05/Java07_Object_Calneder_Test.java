package chapter05;

import java.text.ParseException;
import java.util.Calendar;

public class Java07_Object_Calneder_Test {
    public static void main(String[] args) throws ParseException {
     //TODO 日期類
    	//打印當前日曆
    	System.out.println("周一\t周二\t周三\t周四\t周五\t周六\t周日");
    	//獲取當前日期的日曆物件 靜態方法
    	Calendar firstDate = Calendar.getInstance();
    	//把日曆對象設定為當前月的第一天 // 04-01
    	firstDate.set(Calendar.DAY_OF_MONTH,1);
		//取得當月最大天數
    	int maxDay = firstDate.getActualMaximum(Calendar.DAY_OF_MONTH);
		//遍歷當月的每一天並打印日曆
    	for (int i = 0; i < maxDay; i++) {
    		//當前日期是周幾
    		int weekX = firstDate.get(Calendar.DAY_OF_WEEK);
    		//當前日期是幾號
    		int monthY = firstDate.get(Calendar.DAY_OF_MONTH);
			//如果是當月第一天
			//4/1 是星期幾 需要幾個\t
    		if(i == 0 ) {
				//如果第一天是星期天(1) 則打印六個制表符
    			if (weekX == Calendar.SUNDAY) {
					for (int j = 0; j < 6; j++) {
						System.out.print("\t");
					}
					System.out.println(monthY);
				}else {
					// weekX = 當前星期幾 SUNDAY (1)
					//tueday 3 - 2 = 1
					//根據星期幾來打印 \t
					for (int j = 0; j < weekX -2; j++) {
						System.out.print("\t");
					}
					System.out.print(monthY);
					System.out.print("\t");
				}
    		}else {
				// 當不是第一天時的情況(日曆的二號)
    			if(weekX == Calendar.SUNDAY) {
					// 如果是星期日，則打印日期後換行
					System.out.println(monthY);
    			}else {
					// 否則在同一行打印日期，並加一個制表符
    				System.out.print(monthY);
    				System.out.print("\t");
    			}
    		}
			//把當前日期 +1 遍歷
    		firstDate.add(Calendar.DATE, 1);
			
		}

    }

}