package com.pl.com.pl.utils;

import java.sql.Timestamp;
import java.util.Date;

public class RandomUtils {
    public static String getRandomString(String prefix){
        return prefix + new Timestamp(new Date().getTime()).toString();
    }
}
