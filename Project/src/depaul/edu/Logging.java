package depaul.edu;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Logging {
	public void log(String str) {
	    String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
	    System.out.println("[INFO] " + timestamp + " " + str);
	}
}