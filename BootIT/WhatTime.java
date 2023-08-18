import java.util.Calendar;

public class WhatTime {
    static void stars() {
        System.out.println("*********************");
    }

    static String timeOfDay(int time) {
        if (time > 6 && time < 12)
            return "morning";
        else if (time >= 12 && time < 13)
            return "noon";
        else if (time >= 13 && time < 18)
            return "afternoon";
        else if (time >= 18 && time <= 23)
            return "evening";
        else if (time == 0)
            return "midnight";
        else
            return "night";
    }

    static String unitOfTime(int time) {
        if (time >= 0 && time < 13)
            return "am";
        else
            return "pm";
    }

    public static void main(String[] args) {
        stars();
        int time = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if (time >= 0 && time <= 23)
            System.out.println("The time now is " + "at " + time + unitOfTime(time) + " on " + timeOfDay(time));
        else
            System.out.println("not a valid time");

    }
}
