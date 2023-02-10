package com.zhengwei.common;

import java.util.*;

public class test2 {

    public static void main(String[] args) {
        List<String> dateStr = new ArrayList<>();
        while(true) {
            System.out.println(new Date().getTime());
            dateStr.add(new Date().getTime() + "ms");
        }
    }

    private static Date trimDate(Date date) {
        if (null == date) {
            return null;
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        cal.set(Calendar.MILLISECOND, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        return cal.getTime();
    }
}
