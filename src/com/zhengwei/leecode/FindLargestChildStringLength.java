package com.zhengwei.leecode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author: zhengwei
 * @Date: 4/14/21
 * @Description: https://leetcode.wang/leetCode-3-Longest-Substring-Without-Repeating-Characters.html
 * 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度
 */
public class FindLargestChildStringLength {

    public static void main(String[] args) {
        String s = "bbbbb";
        System.out.println(solution4(s));
    }

    private static int solution4(String s) {
        if (s.length() == 0) {
            return 0;
        }
        Map<Character , Integer> charMap = new HashMap<>();
        int left = 0;
        int max = 0;
        for(int right = 0 ; right < s.length() ; right++) {
            if(!charMap.containsKey(s.charAt(right))) {
                charMap.put(s.charAt(right) , right);
                max = Math.max(max , right - left + 1);
            }else{
                left = Math.max(left,charMap.get(s.charAt(right)) + 1);
            }
        }
        return max;
    }

    //leecode 滑动窗口 答案
    public int lengthOfLongestSubstring2(String s) {
        if (s.length()==0) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i ++){
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        return max;
    }


    private static int solution3(String s) {
        if (s.length() == 0) {
            return 0;
        }
        Set<Character> characterSet = new HashSet<>();
        int left = -1;
        int max = 0;
        for (int right = 0; right < s.length(); right++) {
            Character rightChat = s.charAt(right);
            if(!characterSet.contains(rightChat)) {
                characterSet.add(rightChat);
                int sub = right - left;
                max = Math.max(sub , max);
            }else{
                left++;
                characterSet.remove(s.charAt(left));
                characterSet.add(rightChat);
            }
        }
        return max;
    }


    private static int solution(String s) {
        if (s.length() == 0) {
            return 0;
        }

        Set<Character> characterSet = new HashSet<>();
        int left = -1;
        int right = 0;
        int max = 0;

        while (left < s.length() && right < s.length()) {
            if (left >= 0 && left < s.length()) {
                characterSet.remove(s.charAt(left));
            }
            left++;
            while (right < s.length() && !characterSet.contains(s.charAt(right))) {
                characterSet.add(s.charAt(right));
                right++;
            }

            max = Math.max(max, right - left);
        }

        return max;
    }

    private static int lengthOfLongestSubstring(String s) {
        int length = s.length();
        if (length == 1) {
            return 1;
        }
        int ret = 0;
        int j;
        Set<Character> set = new HashSet();
        for (int i = 0; i < length; i++) {
            if (i - 1 >= 0) {
                set.remove(s.charAt(i - 1));
            }
            set.add(s.charAt(i));
            for (j = i + 1; j < length; j++) {
                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j));
                } else {
                    break;
                }
            }
            ret = Math.max(ret, j - i);
        }

        return ret;
    }


    private static int solution2(String s) {
        // 哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();

        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }
}
