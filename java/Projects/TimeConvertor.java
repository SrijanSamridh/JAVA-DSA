package Projects;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

public class TimeConvertor {

    static ZonedDateTime timeIndianToChicago(){
        return ZonedDateTime.now( ZoneId.of( "Pacific/Auckland" ))              // Current moment in a particular time zone.
                .withZoneSameInstant( ZoneId.of( "Asia/Kolkata" ));
    }

    public static void main(String[] args) {
        System.out.println(timeIndianToChicago());
    }
}
