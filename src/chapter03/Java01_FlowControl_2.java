package chapter03;

public class Java01_FlowControl_2 {
    public static void main(String[] args) {
        //todo 流程控制 分支執行
        //分支結構
        //todo 可選分支 單分支結構
        System.out.println("第一步");
        System.out.println("第二步");
    //  判斷 條件表達式為true 才會執行分之邏輯false 則不執行
        int i = 20;
        if(i ==20){
            System.out.println("分支");

        }
        System.out.println("第三步");

        //todo 必選分支 雙分支結構(二選一)
        int j = 20;
        if(j ==10){
            System.out.println("分支一");
        }else {
            System.out.println("不滿足一時執行");
        }
        System.out.println("第四步");

        //todo 多分支 多重判斷
        //if ... else if ...else
        int k = 30;
        if(k ==10){
            System.out.println("多重分支一");
        } else if (k == 30) {
            System.out.println("不滿足if執行多重分支二");
        } else  {
            System.out.println("都不滿足時執行");

        }
        System.out.println("步驟五");

    }
}
