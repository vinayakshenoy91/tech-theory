package strings;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;

public class Test {

	public static void main(String[] args) throws ParseException {
		
		DateFormat utcFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
		utcFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

		Date date = utcFormat.parse("2019-06-04T23:15:00Z");
		
		System.out.println(date.toInstant());

        LocalDate x = LocalDateTime.ofInstant(date.toInstant(), ZoneId.of("Europe/London")).toLocalDate();


        String[] arr="2429_091019_1_1_08_GB_HD".split("_");
        
        System.out.println(arr.length);
        
        
	}

}
