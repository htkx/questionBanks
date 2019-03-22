package com.question.bank.leedcode;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 示例 1:
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * 输入: 120
 * 输出: 21
 */
public class Reverse {

    public static void main(String[] args) {
        reverse(321);
        reverse(9780);
        reverse(-1580);
    }

    public static int reverse(int x) {
        long l1 = System.currentTimeMillis();
        boolean flag = true;
        if (x < 0) {
            flag = false;
            x *= -1;
        }
        String str = String.valueOf(x);
        char[] arr = str.toCharArray();
        String result = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            result += arr[i];
        }
        int re = flag ? Integer.valueOf(result) : -1 * Integer.valueOf(result);
        long l2 = System.currentTimeMillis() - l1;
        System.out.println(x + "-->" + re + "，用时："+ l2);
        return re;
    }

}
