package chapter03;

public class Java04_FlowControl_Test {
    public static void main(String[] args) {
       // TODO 流程控制 小練習
    	//兒童0-6 少年7-17 青年18-40 中年 41-65 老年66 
    	//多分支
    	int age = 31;
//    	if(age < 7) {
//    	System.out.println("child");
//    }else if (age>= 7 && age <18) {
//		System.out.println("teenager");
//	}else if (age >=18 && age<41) {
//		//不能寫 18 < age <41 這樣 因為前面比較會先變布林值 布林值無法比較 
//		System.out.println("青年");
//
//	}else if (age >=41 && age <66) {
//		System.out.println("中年");
//
//	}else {
//		System.out.println("老頭");
//	}
    	
    	//簡寫
    	if(age < 7) {
    	System.out.println("child");
    }else if (age <18) {
		System.out.println("teenager");
	}else if (age<41) {
		System.out.println("青年");

	}else if (age  <66) {
		System.out.println("中年");

	}else {
		System.out.println("老頭");
	}
    	
    	
}
    
    }