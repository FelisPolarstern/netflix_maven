package classes.Database_Import;
import java.sql.*;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class TimeFormatConverter {
    static public String ConvertISOTimestampToTimestampFormat(String toConvert){
        Instant i = Instant.parse(toConvert);
        System.out.println(i);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone((ZoneId.of("UTC")));
        String fmt = formatter.format(i);
        System.out.println(fmt);
        return fmt;
    }
    static public Instant ConvertStringToInstant(String ConvertedInstant){
        // this.customer_creation_timeStamp = Timestamp.valueOf(AccountDetailsImport[9]);
        Instant temp = Instant.parse(ConvertedInstant);
        System.out.println(temp);
       return temp;
    }
}
