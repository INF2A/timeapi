package main.java;
import java.time.*;

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

    /**
        Constructor for the time class
     **/
    public Time()
    {

    }

    /**
     *
     * @return this method will get the current time, and return a string in json format containing the current time and date.
     */

    public String getCurrentDate()
    {

        String time;
        LocalDateTime now = LocalDateTime.now(); // store the current date time (LocatDateTime)

        DayOfWeek day = now.getDayOfWeek(); // store the current day(DayOfWeek)
        int hour = now.getHour(); // store the current hour(int)
        int minute = now.getMinute();//store the current minute (int)
        int second = now.getSecond();//store the current second (int)
        int dayofMonth = now.getDayOfMonth();//store current day of month (int)
        int month =now.getMonthValue();//store current month (int)
        int year = now.getYear();//store current year (int)
        //set the time string to a json format, containing the values set earlier.
        time = "{\n\"dateTime\":\n{" +
                "\n\"hour\":" + "\"" +hour + "\"," +
                "\n\"minute\":"+ "\""+ minute + "\"," +
                "\n\"second\":"+ "\""+ second + "\"," +
                "\n\"day\":" + "\"" + day.name() + "\","+
                "\n\"day_of_month\":" + "\"" + dayofMonth + "\","+
                "\n\"month\":" + "\"" + month + "\","+
                "\n\"year\":" +"\"" + year + "\"                "+
                "}\n}\n";
        return time;//return the time string
    }

    /**
     * return a string formatted to json, containing the current time of a given continent and place
     * @param continent continent of the requested time
     * @param place place of the requested time
     * @return return a string formatted to json, containing the current time of a given continent and place
     */
    public String getCurrentDateWithTimeZone(String continent, String place)
    {
        String time;//initialize the String time
        LocalDateTime current = LocalDateTime.MAX.now(ZoneId.of(continent+"/"+place));//store the current date time, according to the continent and place
        DayOfWeek day = current.getDayOfWeek();//store the current day, according to the continent and place
        int hour = current.getHour();//store the current hour, according to the continent and place(int)
        int minute = current.getMinute();//store the current minute, according to the continent and place(int)
        int second = current.getSecond();//store the current second, according to the continent and place(int)
        int dayofMonth = current.getDayOfMonth();//store the current day of the month, according to the continent and place(int)
        int month =current.getMonthValue();//store the current month,according to the continent and place(int)
        int year = current.getYear();//store the current year, according to the continent and place(int)
        //set the time string to a json format, containing the values set earlier.
        time = "{\n\"dateTime\":{" +
                "\n\"hour\":" + "\"" +hour + "\"," +
                "\n\"minute\":"+ "\""+ minute + "\"," +
                "\n\"second\":"+ "\""+ second + "\"," +
                "\n\"day\":" + "\"" + day.name() + "\","+
                "\n\"day_of_month\":" + "\"" + dayofMonth + "\","+
                "\n\"month\":" + "\"" + month + "\","+
                "\n\"year\":" +"\"" + year + "\""+
                "}\n}";
        return time;//return the time string
    }
}
