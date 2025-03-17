package chapter03;

public class Java03_FlowControl_3 {
    public static void main(String[] args) {
        //todo 流程控制 分支執行
        //特殊分支結構
        //switch (資料){}
        //
        int i = 40;
        switch ( i ){
            case 10:
                System.out.println("分支一");
                break;
                case 20:
                    System.out.println("分支二");
                    case 30:
                        System.out.println("分支三");
                        default:
                        	System.out.println("其他分支");
        }
    }
}