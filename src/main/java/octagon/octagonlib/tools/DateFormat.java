package octagon.octagonlib.tools;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public interface DateFormat {
    String MGL_TIME_ZONE = "Asia/Ulaanbaatar";
    String DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";
    String DATE_PATTERN_NO_HOUR = "yyyy-MM-dd";
    String DECIMAL_FORMAT = "#,###.00";

    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(MGL_TIME_ZONE));
    int year = calendar.get(Calendar.YEAR);
    int month = calendar.get(Calendar.MONTH) + 1;
    int day = calendar.get(Calendar.DAY_OF_MONTH);
    int hour = calendar.get(Calendar.HOUR_OF_DAY);
    int minute = calendar.get(Calendar.MINUTE);
    int second = calendar.get(Calendar.SECOND);
    int millis = calendar.get(Calendar.MILLISECOND);

    String sysDateString = calendar.get(Calendar.YEAR) + "/" + (calendar.get(Calendar.MONTH)+1) + "/" + calendar.get(Calendar.DAY_OF_MONTH) ;
    Date sysDate = calendar.getTime();

    SimpleDateFormat smtSlashminus = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
}

