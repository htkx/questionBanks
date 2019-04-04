package com.question.bank.test;

/**
 * java浮点数运算中有两个特殊的情况：NAN、INFINITY
 */
public class TestMain {
    // jdk 源码 Double Float 定义
    /**
     * A constant holding the positive infinity of type
     * {@code double}. It is equal to the value returned by
     * {@code Double.longBitsToDouble(0x7ff0000000000000L)}.
     */
    public static final double POSITIVE_INFINITY = 1.0 / 0.0;

    /**
     * A constant holding the negative infinity of type
     * {@code double}. It is equal to the value returned by
     * {@code Double.longBitsToDouble(0xfff0000000000000L)}.
     */
    public static final double NEGATIVE_INFINITY = -1.0 / 0.0;

    /**
     * A constant holding a Not-a-Number (NaN) value of type
     * {@code double}. It is equivalent to the value returned by
     * {@code Double.longBitsToDouble(0x7ff8000000000000L)}.
     */
    public static final double NaN = 0.0d / 0.0;

    // 7 源码

    public static void main(String[] args) {
        System.out.println(POSITIVE_INFINITY);
        System.out.println(NEGATIVE_INFINITY);
        System.out.println(NaN);
        System.out.println("---------------------");
        System.out.println(POSITIVE_INFINITY * 0);
        System.out.println(POSITIVE_INFINITY * 1);
        System.out.println(POSITIVE_INFINITY / 0);
        System.out.println(POSITIVE_INFINITY + 1000);
        System.out.println("---------------------");
        System.out.println(NEGATIVE_INFINITY * 0);
        System.out.println(NEGATIVE_INFINITY * 1);
        System.out.println(NEGATIVE_INFINITY / 0);
        System.out.println(NEGATIVE_INFINITY + 1000);
        System.out.println("---------------------");
        System.out.println(NaN * 0);
        System.out.println(NaN * 1);
        System.out.println(NaN / 0);
        System.out.println(NaN + 1000);
    }

}
