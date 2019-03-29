package com.question.bank.leedcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 * <p>
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 */
public class RomanToInt {
    public static void main(String[] args) {
        romanToInt("MCMXCIV");
    }

    public static int romanToInt(String s) {
        int result = 0;
        String[][] doubleArr = new String[][]{{"I", "1"}
                , {"V", "5"}
                , {"X", "10"}
                , {"L", "50"}
                , {"C", "100"}
                , {"D", "500"}
                , {"M", "1000"}};
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < doubleArr.length; i++) {
            map.put(doubleArr[i][0], Integer.valueOf(doubleArr[i][1]));
            map.put(doubleArr[i][0] + doubleArr[i][0], Integer.valueOf(doubleArr[i][1]) * 2);
            map.put(doubleArr[i][0] + doubleArr[i][0] + doubleArr[i][0], Integer.valueOf(doubleArr[i][1]) * 3);
        }
        Map<String, Integer> map2 = new HashMap<String, Integer>();
        //将所有可能的罗马数字放到数组中
        for (int i = 0; i < 3; i++) {
            map2.put(doubleArr[i * 2][0] + doubleArr[i * 2 + 1][0], Integer.valueOf(doubleArr[i * 2 + 1][1]) - Integer.valueOf(doubleArr[i * 2][1]));
            map2.put(doubleArr[i * 2][0] + doubleArr[i * 2 + 2][0], Integer.valueOf(doubleArr[i * 2 + 2][1]) - Integer.valueOf(doubleArr[i * 2][1]));
        }
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            s = s.replaceAll(entry.getKey(), "," + entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            s = s.replaceAll(entry.getKey(), "," + entry.getValue());
        }
        String[] arr = s.split(",");
        for (String s1 : arr) {
            if (s1 != null && !s1.equals("")) {
                result += Integer.valueOf(s1);
            }
        }
        System.out.println(result);
        return result;
    }

    /**
     * 首先建立一个HashMap来映射符号和值，
     * 然后对字符串从左到右来，
     * 如果当前字符代表的值不小于其右边，就加上该值；
     * 否则就减去该值。
     * 以此类推到最左边的数，
     * 最终得到的结果即是答案
     *
     * @param s
     * @return
     */
    public static int romanToInt2(String s) {
        int result = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char[] arr = s.toCharArray();
        result += map.get(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                result -= arr[i];
            } else {
                result += arr[i];
            }
        }
        System.out.println(result);
        return result;
    }
}
