package com.question.bank.leedcode.easy;

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
//        reverse(321);
//        reverse(9780);
//        reverse(-1580);
//        reverse(1056389759);
        reverse(-2147483648);
    }

    /**
     * 功能描述 : 字符串反转
     * 创建时间 : 2019/03/27 14:14
     * [相关类/方法]
     * [产品/模块版本]
     */
    public static int reverse(int x) {
        boolean flag = true;
        long a = x;
        if (x < 0) {
            flag = false;
            a = -(long) x;
        }
        String str = String.valueOf(a);
        char[] arr = str.toCharArray();
        String result = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            result += arr[i];
        }
        long rl = Long.parseLong(result);
        if (rl > Integer.MAX_VALUE || (rl * -1) < Integer.MIN_VALUE) {
            return 0;
        }
        int re = flag ? Integer.valueOf(result) : -1 * Integer.valueOf(result);
        return re;
    }

    /**
     * 功能描述 : 弹出与推入
     * 创建时间 : 2019/03/27 14:13
     * [相关类/方法]
     * [产品/模块版本]
     */
    public static int reverse2(int a) {
        int result = 0;
        while (a != 0) {
            int b = a % 10;
            a /= 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && b > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && b < -8)) {
                return 0;
            }
            result = result * 10 + b;
        }
        System.out.println(result);
        return result;
    }

}
