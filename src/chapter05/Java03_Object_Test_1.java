package chapter05;

public class Java03_Object_Test_1 {
    public static void main(String[] args) {
        //TODO 冒泡排序
        //TODO 倆倆比較 最大移到最旁邊
        int[] nums ={1,4,3,5,2};
        //希望得到 12345
        //外層 遍歷
        for (int j = 0; j < nums.length; j++) {
            //-j 是因為 外層已經比過 所以不用再比 -1是因為索引從0開始起算
            for (int i = 0; i < nums.length-j-1; i++) {
                //交換邏輯 比較 num1 num2 如果符合條件會交換位置
                int num1 = nums[i];
                int num2 = nums[i+1];
                if(num1>num2){
                    nums[i] = num2;
                    nums[i+1] = num1;

                }
            }
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }

}