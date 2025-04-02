package chapter05;

public class Java03_Object_Test_1 {
    public static void main(String[] args) {
        //TODO 冒泡排序
        //TODO 倆倆比較 最大移到最旁邊
        int[] nums = {1, 4, 3, 5, 2};
        //希望得到 12345
        //外層 遍歷 總輪數
        //每完成一次將最大的數放到最旁邊
        for (int j = 0; j < nums.length; j++) {
            //-j 是因為 外層已經比過 所以不用再比 -1是因為索引從0開始起算
            //內層負責比較 交換
            for (int i = 0; i < nums.length - j - 1; i++) {
                //取得相鄰的兩個數
                int num1 = nums[i];
                int num2 = nums[i + 1];
                //交換邏輯 比較 num1 num2
                //如果符合條件會交換位置
                if (num1 > num2) {
                    nums[i] = num2;
                    nums[i + 1] = num1;
                    /*
                    第 j = 0 輪（第一輪內層迴圈）：
                    比較 nums[0] 和 nums[1]，(1 vs 4) → 不交換
                    比較 nums[1] 和 nums[2]，(4 vs 3) → 交換，變成 {1, 3, 4, 5, 2}
                    比較 nums[2] 和 nums[3]，(4 vs 5) → 不交換
                    比較 nums[3] 和 nums[4]，(5 vs 2) → 交換，變成 {1, 3, 4, 2, 5}
                    第一輪結束，最大值 5 已經到最後
                    */
                }
            }
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }

}