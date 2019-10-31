package practise;
/**********************************************************************
 *给定一个整数数组nums和一个目标值target,请你在该数组中找出和为目标值的那两个
 *整数，并返回他们的数组下标.
 *本题出现了还未学到的异常抛出。
 *思路：1、暴力法，每个数组相应值遍历一遍，输出符合条件的返回一个数组，
 * 否则抛出异常。
 *2、两遍哈希表，
 *********************************************************************/
//2019-10-18 author：黄丙辉

public class TwoSum {
    //暴力法
    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0;i < nums.length-1;i++){
            for (int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j] ==target)
                    return new int[] {i,j};
            }
        }
        throw new IllegalArgumentException("No two sum solution");//抛出异常还未学到
    }


    public static void main(String[] args) {
        // write your code here
    }
}
