package com.wolfecodes.wintech.utils;

import java.time.Year;

public class AccountUtils {
    public static final String Account_EXISTS_CODE = "001";
    public static final String Account_EXISTS_MESSAGE = "This account already exist. Please use another email address." ;

    public static final String Account_CREATION_SUCCESS_CODE = "002";
    public static final String Account_CREATION_SUCCESS_MESSAGE = "Account created successfully!" ;

    public static String getAccountNumber() {
        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;
        int randomNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        String year = String.valueOf(currentYear);
        String randomNum = String.valueOf(randomNumber);
        StringBuilder accountNum = new StringBuilder();

        return accountNum.append(year).append(randomNum).toString();
    }
}
