import java.text.*;

import java.util.*;

public class DateTime {

public static void main(String[] args) {

SimpleDateFormat sd = new SimpleDateFormat(

"yyyy.MM.dd G 'at' HH:mm:ss z");

Date date = new Date();

sd.setTimeZone(TimeZone.getTimeZone("IST"));

System.out.println("Hello Nagamani");

System.out.println("Current Date and Time :"+sd.format(date));

}

}
