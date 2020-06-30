package com.adufeitian.servicesystem.util;


import com.adufeitian.servicesystem.enums.SimpleStringCheckEnum;

public class CheckString {
    public static SimpleStringCheckEnum simpleStringCheck(String str, int min, int max) {
        // 判断是否为ASCII码
        byte[] strByte = str.getBytes();
        byte lower = '!';
        byte upper = '~';

        if ( strByte.length != str.length()) {
            return SimpleStringCheckEnum.ILLEG_CHAR;
        }

        // 判断是否仅为数字，字母和一些常用字符
        for ( byte i : strByte) {
            if(Byte.compare(i,lower)<0 && (Byte.compare(upper,i))<0)
                return SimpleStringCheckEnum.ILLEG_CHAR;
        }

        // 判断长度是否大于16
        if ( str.length() > max) {
            return SimpleStringCheckEnum.TOO_LONG;
        }

        // 判断长度是否小于8
        if ( str.length() < min) {
            return SimpleStringCheckEnum.TOO_SHORT;
        }

        return SimpleStringCheckEnum.OK;
    }
    public static boolean stringLengthcheck (String str, int min, int max) {
        int length = str.length();
        if (length>=min && length <=max) {
            return true;
        }else {
            return false;
        }
    }
    public static Integer stringToInt(String s,int radix) {
        if (s == null) {
            return null;
        }

        if (radix < Character.MIN_RADIX) {
            return null;
        }

        if (radix > Character.MAX_RADIX) {
            return null;
        }

        int result = 0;
        boolean negative = false;
        int i = 0, len = s.length();
        int limit = -Integer.MAX_VALUE;
        int multmin;
        int digit;

        if (len > 0) {
            char firstChar = s.charAt(0);
            if (firstChar < '0') { // Possible leading "+" or "-"
                if (firstChar == '-') {
                    negative = true;
                    limit = Integer.MIN_VALUE;
                } else if (firstChar != '+')
                    return null;

                if (len == 1) // Cannot have lone "+" or "-"
                    return null;
                i++;
            }
            multmin = limit / radix;
            while (i < len) {
                // Accumulating negatively avoids surprises near MAX_VALUE
                digit = Character.digit(s.charAt(i++),radix);
                if (digit < 0) {
                    return null;
                }
                if (result < multmin) {
                    return null;
                }
                result *= radix;
                if (result < limit + digit) {
                    return null;
                }
                result -= digit;
            }
        } else {
            return null;
        }
        return negative ? result : -result;
    }
}
