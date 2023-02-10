package com.zhengwei.leecode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhengwei
 * @Date: 4/13/21
 * @Description: 两数相加
 */
public class TwoNumberAdd {

    public static void main(String[] args) {
        System.out.println(solution("1100", "200"));
    }

//    public static String addStrings(String num1, String num2) {
//        int add = 0;
//        int lengthNum1 = num1.length();
//        int lengthNum2 = num2.length();
//        StringBuilder sb = new StringBuilder();
//
//        while (lengthNum1 > 0 || lengthNum2 > 0 || add != 0) {
//            int a = lengthNum1 - 1 >= 0 ? num1.charAt(lengthNum1 - 1) - '0' : 0;
//            int b = lengthNum2 - 1 >= 0 ? num2.charAt(lengthNum2 - 1) - '0' : 0;
//
//            sb.append((a + b + add) % 10);
//
//            lengthNum1--;
//            lengthNum2--;
//            add = (a + b + add) / 10;
//        }
//
//        return sb.reverse().toString();
//    }


    private static String solution(String num1 , String num2){

        StringBuilder sb = new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;
        int add = 0;

        while(i>=0 || j>=0 || add > 0){
            int a = i>=0 ? num1.charAt(i) - '0' : 0;
            int b = j>=0 ? num2.charAt(j) - '0' : 0;

            int ret = a+b+add;
            sb.append(ret % 10);
            add = ret / 10;

            i--;
            j--;
        }

        return sb.reverse().toString();
    }























    public static String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuffer ans = new StringBuffer();

        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;

            int result = x + y + add;
            ans.append(result % 10);
            add = result / 10;

            i--;
            j--;
        }

        // 计算完以后的答案需要翻转过来
        ans.reverse();
        return ans.toString();
    }

}
