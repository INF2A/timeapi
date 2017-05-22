package main.java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
=============================
KWALITEITS COMMENTAAR
=============================
0. Voeg commentaar toe - IntelliJ typ '/**' en dan ram op enter; Doe dit voor elke functie en de clas beschrvijging
1. Zet erbij waar de class voor is.
2. Zet boven elke functie commentaar waar de functie voor bedoeld is
    - Hierbij komt waar elke parameter voor is als de functie deze heeft
    - Hierbij komt waar de return type voor is
3. Zet duidelijke methode namen neer die slaan op wat de methode doet
4. Hou het SRP in de gaten. Elke methode heeft zijn eigen verantwoordelijkheid. Net zo als elke klasse dat heeft.
    - SRP (Single Responsibility Design)
*/

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
