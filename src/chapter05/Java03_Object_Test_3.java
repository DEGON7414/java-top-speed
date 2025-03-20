package chapter05;

public class Java03_Object_Test_3 {
    public static void main(String[] args) {
     //TODO 二分查找法
        int[] nums = {1,2,3,4,5,6,7};

        int target = 5;
        //起始索引
        int startIndex = 0;
        //結束範圍索引
        int endIndex = nums.length-1;
        //中間索引 預設 0
        int middleIndex = 0;
        while(startIndex<=endIndex){
            middleIndex = (startIndex+endIndex)/2;
            if (nums[middleIndex]>target){
                endIndex = middleIndex-1;//目標在左
            } else if (nums[middleIndex]<target) {
                startIndex = middleIndex+1;//目標在右
            }else {
                break;
        }

}
        System.out.println("目標在:"+middleIndex);
}
}