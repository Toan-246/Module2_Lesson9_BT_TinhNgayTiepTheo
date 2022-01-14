package com.codegym;

public class NextDayCalculator {
    public static int[] nextDay(int[] date) {
        if (date.length != 3) return null;
        int day = date[0];
        int month = date[1];
        int year = date[2];
        day += 1;

        if (day > dayOfMonth(month, year)) {
            day = 1;
            month += 1;
        }

        if (month > monOfyear()) {
            month = 1;
            year += 1;
        }
        return new int[]{day, month, year};
    }

    public static boolean isleapYear(int year) {
        boolean isleapYear = false;
        boolean isDivisionBy4 = year % 4 == 0;
        if (isDivisionBy4) {
            boolean isDivisionBy100 = year % 100 == 0;
            if (isDivisionBy100) {
                boolean isDivisionBy400 = year % 400 == 0;
                if (isDivisionBy400) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static int dayOfMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isleapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }

    public static int monOfyear() {
        return 12;
    }
}
