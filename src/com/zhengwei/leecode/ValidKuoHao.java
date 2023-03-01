package com.zhengwei.leecode;

import java.util.Stack;

/**
 * @Author: zhengwei
 * @Date: 2023/3/1
 * @Description:
 * 20. 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ValidKuoHao {

    public static void main(String[] args) {
        String s = "([}}])";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();
        char[] chars = s.toCharArray();
        if(chars.length <= 1 || chars.length % 2 != 0) {
            return false;
        }
        for(char c : chars) {
            if(characterStack.empty() || c == '(' || c == '{' || c == '[') {
                characterStack.add(c);
            }else{
                Character stackTop = characterStack.peek();
                if(c == ')' && stackTop.equals('(')) {
                    characterStack.pop();
                }else if(c == '}' && stackTop.equals('{')) {
                    characterStack.pop();
                }else if(c == ']' && stackTop.equals('[')) {
                    characterStack.pop();
                }else{
                    return false;
                }
            }
        }
        return characterStack.empty();
    }
}
