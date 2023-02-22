package com.zhengwei.leecode;

/**
 * @Author: zhengwei
 * @Date: 2023-02-14 15:06:42
 * @Description:
 * 问题：有两个字符串str和str2，求出两个字符串中最长公共子串长度。
 * 比如：str=acbcbcef，str2=abcbced，则str和str2的最长公共子串为bcbce，最长公共子串长度为5
 * https://blog.csdn.net/u010397369/article/details/38979077
 */
public class FindLargestCommonChildString {

    public static void main(String[] args) {
        String str1="acbcbcef";
        String str2="abcbced";
        System.out.println(FindLargestCommonChildString(str1 , str2));
    }

    private static int FindLargestCommonChildString(String str1 , String str2) {
        char[] ary = str1.toCharArray();
        char[] ary2 = str2.toCharArray();

        int[][] temp = new int[ary.length][ary2.length];	//声明一个二维数组，存储最长公共子串长度
        int length = 0;	//最长公共子串长度
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary2.length; j++) {
                if(ary[i] == ary2[j]){
                    if(i > 0 && j > 0){
                        temp[i][j] = temp[i-1][j-1] + 1;
                    }else{
                        temp[i][j] = 1;
                    }

                    if(temp[i][j] > length){	//当前元素值大于最大公共子串长度
                        length = temp[i][j];
                    }
                }else{
                    temp[i][j] = 0;
                }
            }
        }
        return length;
    }
}
