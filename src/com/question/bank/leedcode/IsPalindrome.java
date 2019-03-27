package com.question.bank.leedcode;

import com.sun.org.apache.bcel.internal.util.Objects;

import java.util.ArrayList;
import java.util.List;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome2(123321));
        System.out.println(isPalindrome2(-12321));
        System.out.println(isPalindrome2(-1212321));
    }

    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            if (!Objects.equals(arr[i], arr[arr.length - i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(int x) {

        List<String> list = new ArrayList<String>();
        if (x < 0) {
            return false;
        }
        while (x != 0) {
            list.add(String.valueOf(x % 10));
            x /= 10;
        }
        for (int i = 0; i < list.size() / 2; i++) {
            if (!list.get(i).equals(list.get(list.size() - i - 1))) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindrome3(int x) {
        // 特殊情况：
        // 如上所述，当 x < 0 时，x 不是回文数。
        // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
        // 则其第一位数字也应该是 0
        // 只有 0 满足这一属性
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
        return x == revertedNumber || x == revertedNumber/10;
    }
}
