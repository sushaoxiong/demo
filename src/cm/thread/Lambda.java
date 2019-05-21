package cm.thread;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class Lambda {

    @Test
    public void test(){
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String format = localDateTime.format(dateTimeFormatter);
        System.out.println(format);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String format1 = simpleDateFormat.format(date);
        System.out.println(format1);
    }

    @Test
    public void test2(){
        int k = 0;
        int a = ++k + k++;
        System.out.println(a);
    }

}
