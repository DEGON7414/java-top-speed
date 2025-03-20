package chapter05;

public class Java03_Object_Test_2 {
    public static void main(String[] args) {
        //TODO 選擇排序
        //找最大值插入最前面
        int[] nums ={1,4,3,5,2};
        for(int j = 0; j < nums.length-1; j++) {
            //找出最大的 //假定第一個是最大的
            int maxIndex = 0;
            // -j 代表只考慮到還沒排到的
            for (int i = 1; i < nums.length-j; i++) {
                if(nums[i]>nums[maxIndex]){
                    maxIndex = i;
                }
            }
            //num1 還沒排序的最後一位 length-j-1
            int num1 = nums[nums.length-j-1];
            //最大
            int num2 = nums[maxIndex];
            //交換
            nums[maxIndex] = num1;
            nums[nums.length-j-1] = num2;
        }

        for(int num:nums){
            System.out.println(num);
        }
    }

}