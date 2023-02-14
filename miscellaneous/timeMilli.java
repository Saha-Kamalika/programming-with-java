package classFiles;
import java.util.Date;
import java.util.Calendar; //abstract class...instance cannot be created using "new" keyword....getInstance() method is used to create such an instance
//1st Jan 1970 is considered as the reference date
//Java.time available from Java v8, before it Java.util contained the time class
public class timeMilli {
    public static void main(String[] args)
    {
        System.out.println("Number of milliseconds from year 1970 uptil now: "+System.currentTimeMillis()+" ms");
        System.out.println("Number of seconds from year 1970 uptil now: "+System.currentTimeMillis()/1000+" seconds");
        System.out.println("Number of minutes from year 1970 uptil now: "+System.currentTimeMillis()/1000/3600+" minutes");
        System.out.println("Number of hours from year 1970 uptil now: "+System.currentTimeMillis()/1000/3600/24+" hours");
        System.out.println("Number of years from year 1970 uptil now: "+System.currentTimeMillis()/1000/3600/24/365+" years");
        Date d=new Date();
        System.out.println(d);
        System.out.println(d.getDate()); //deprecated
        Calendar c=Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
    }
}
