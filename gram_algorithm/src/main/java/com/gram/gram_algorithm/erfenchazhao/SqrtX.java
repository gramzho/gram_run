package com.gram.gram_algorithm.erfenchazhao;

/**
 * @Author: zotij
 * @Date: 2024/4/20  23:15
 */
public class SqrtX {
    public static void main(String[] args) {
        X();
        System.out.println(binarySearch(586));
    }

    public static void X() {
        // 暴力算法，求解x的平方根的整数部分
        int a = 586;
        int temp = 1;
        while (temp * temp < a ) {
            temp += 1;

        }
        System.out.println(temp - 1);
    }
    // 二分查找 时间复杂度logN
    public static int binarySearch(int x) {
        int index = -1;
        int l = 0;
        int r = x;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (mid * mid <= x) {
                index = mid;
                l = mid + 1;
            } else {
                r = mid -1;
            }
        }
        return index;
    }

    // 牛顿迭代
    public static int newton(int x) {
        return -1;
    }
}
