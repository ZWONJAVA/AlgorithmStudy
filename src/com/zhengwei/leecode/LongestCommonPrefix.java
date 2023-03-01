package com.zhengwei.leecode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhengwei
 * @Date: 2023/2/27
 * @Description: https://leetcode.cn/problems/longest-common-prefix/
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = new String[2];
        strs[0] = "cir";
        strs[1] = "car";
        System.out.println(longestCommonPrefixSelf(strs));
    }

    public static String longestCommonPrefixSelf(String[] strs) {
        if(strs.length == 1) {
            return strs[0];
        }
        List<Character> characters = new ArrayList<>();
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            int index = 0;
            int max = 0;
            for(Character c : chars) {
                if (i == 0) {
                    characters.add(index, chars[index]);
                    max = index + 1;
                }else if(index < characters.size() && characters.get(index).equals(c)){
                    max = index + 1;
                }else{
                    break;
                }
                index++;
            }
            result = Math.min(max , result);
        }
        if(result == 0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < result ; i++) {
            sb.append(characters.get(i));
        }
        return sb.toString();
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        int count = strs.length;
        for (int i = 1; i < count; i++) {
            prefix = longestCommonPrefix(prefix, strs[i]);
            if (prefix.length() == 0) {
                break;
            }
        }
        return prefix;
    }

    public String longestCommonPrefix(String str1, String str2) {
        int length = Math.min(str1.length(), str2.length());
        int index = 0;
        while (index < length && str1.charAt(index) == str2.charAt(index)) {
            index++;
        }
        return str1.substring(0, index);
    }


}
