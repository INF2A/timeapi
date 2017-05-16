package main.java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by rickb on 11-5-2017.
 */
public class Time {

    public Time()
    {
        //printTime();
    }

    public String getCurrentDate()
    {

        String time;
        LocalDateTime now = LocalDateTime.now();

        DayOfWeek day = now.getDayOfWeek();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        int dayofMonth = now.getDayOfMonth();
        int month =now.getMonthValue();
        int year = now.getYear();
        time = "{\n\"dateTime\":[\n{" +
                "\n\"hour\":" + "\"" +hour + "\"," +
                "\n\"minute\":"+ "\""+ minute + "\"," +
                "\n\"second\":"+ "\""+ second + "\"," +
                "\n\"day\":" + "\"" + day.name() + "\","+
                "\n\"day_of_month\":" + "\"" + dayofMonth + "\","+
                "\n\"month\":" + "\"" + month + "\","+
                "\n\"year\":" +"\"" + year + "\"                "+
                "}\n]\n}";
        return time;
    }

    public String test(String continent, String place)
    {
        String time;
        LocalDateTime todayKolkata = LocalDateTime.MAX.now(ZoneId.of(continent+"/"+place));
        DayOfWeek day = todayKolkata.getDayOfWeek();
        int hour = todayKolkata.getHour();
        int minute = todayKolkata.getMinute();
        int second = todayKolkata.getSecond();
        int dayofMonth = todayKolkata.getDayOfMonth();
        int month =todayKolkata.getMonthValue();
        int year = todayKolkata.getYear();
        time = "{\n\"dateTime\":[\n{" +
                "\n\"hour\":" + "\"" +hour + "\"," +
                "\n\"minute\":"+ "\""+ minute + "\"," +
                "\n\"second\":"+ "\""+ second + "\"," +
                "\n\"day\":" + "\"" + day.name() + "\","+
                "\n\"day_of_month\":" + "\"" + dayofMonth + "\","+
                "\n\"month\":" + "\"" + month + "\","+
                "\n\"year\":" +"\"" + year + "\""+
                "}\n]\n}";
        return time;
    }

}
