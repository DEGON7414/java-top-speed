package chapter05;

public class Java03_Object_Test_2 {
    public static void main(String[] args) {
        //TODO 選擇排序
        //TODO實作邏輯: 找最大值插入最前面
        int[] nums = {1, 4, 3, 5, 2};
        // 外層迴圈：控制排序的輪數，每次選擇最大的元素放到最後
        for (int j = 0; j < nums.length - 1; j++) {
            //假定第一個是最大的
            int maxIndex = 0;
            // 內層迴圈：尋找未排序部分的最大值
            // -j 代表只考慮到還沒排到的
            for (int i = 1; i < nums.length - j; i++) {
                if (nums[i] > nums[maxIndex]) {
                    maxIndex = i;
                }
            }
            // 將未排序部分的最後一個元素和最大值進行交換
            int num1 = nums[nums.length - j - 1]; //num1 還沒排序的最後一位 length-j-1
            int num2 = nums[maxIndex]; //未排序中最大
            //交換
            nums[maxIndex] = num1;
            nums[nums.length - j - 1] = num2;
            /*
            外層 j = 0 時，內層開始尋找最大值：

            1. 假設 maxIndex = 0，即假定 1 為最大值
            2. 比較 nums[1] 和 nums[0]：4 > 1 → 更新 maxIndex = 1
            3. 比較 nums[2] 和 nums[1]：3 < 4 → maxIndex 不變
            4. 比較 nums[3] 和 nums[1]：5 > 4 → 更新 maxIndex = 3
            5. 比較 nums[4] 和 nums[3]：2 < 5 → maxIndex 不變

            最大值是 nums[3] = 5，這時 maxIndex = 3

            交換 nums[maxIndex] 和 nums[nums.length-j-1]：
            交換 nums[3] 和 nums[4]（即交換 5 和 2），結果陣列變成：
            {1, 4, 3, 2, 5}

            結果：第一輪結束後，最大的 5 已經放到陣列最後一位

             */
        }

        for (int num : nums) {
            System.out.println(num);
        }
    }

}