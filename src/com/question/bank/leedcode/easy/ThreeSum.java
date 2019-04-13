package com.question.bank.leedcode.easy;

import java.util.Arrays;

/**
 * @author tll
 */
public class ThreeSum {
    /**
     * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，
     * 使得它们的和与 target 最接近。返回这三个数的和。
     * 假定每组输入只存在唯一答案。
     *
     * @param nums
     * @param target
     * @return
     */
    public int threeSumClosest3(int[] nums, int target) {
        // 记录最小的差值
        long minDiff = Long.MAX_VALUE;
        // 记录最小差值对应的三个整数和和
        long result = 0;
        // 每次求得的差值
        long diff;
        // 每次求得的三个整数的和
        long sum;
        // 先对数组进行排序
        Arrays.sort(nums);

        // i表示假设取第i个数作为结果
        for (int i = 0; i < nums.length - 2; i++) {
            // 第二个数可能的起始位置
            int j = i + 1;
            // 第三个数可能是结束位置
            int k = nums.length - 1;

            while (j < k) {
                // 求当前三个数的和
                sum = nums[j] + nums[k] + nums[i];
                // 当前和与目标和之间的差值
                diff = Math.abs(target - sum);

                // 差值为0就直接返回
                if (diff == 0) {
                    return (int) sum;
                }

                // 如果当前的差值比之前记录的差值小
                if (diff < minDiff) {
                    // 更新最小的差值
                    minDiff = diff;
                    // 更新最小差值对应的和
                    result = sum;

                    // 以上的设置在下一次元素处理时生效
                }

                // 和大于target
                if (sum > target) {
                    k--;
                }
                // 和小于target
                else {
                    j++;
                }
            }
        }
        return (int) result;
    }
}