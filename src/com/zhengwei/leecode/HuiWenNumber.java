package com.zhengwei.leecode;

/**
 * @Author: zhengwei
 * @Date: 2023/2/22
 * @Description:
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 *
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 例如，121 是回文，而 123 不是。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/palindrome-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class HuiWenNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }

    public static boolean isPalindrome(int x) {
       String numStr = Integer.toString(x);
       for(int left = 0 ; left < numStr.length() / 2 ; left++) {
           if(left == numStr.length() -left - 1) {
               break;
           }
           char l = numStr.charAt(left);
           char r = numStr.charAt(numStr.length() -left - 1);
           if(l!=r) {
               return false;
           }
       }
       return true;
    }
}
