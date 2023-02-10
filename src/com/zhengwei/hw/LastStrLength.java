package com.zhengwei.hw;

import java.util.Scanner;


public class LastStrLength {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String [] strs = str.split(" ");
        System.out.println(strs[strs.length-1].length());
    }

}
