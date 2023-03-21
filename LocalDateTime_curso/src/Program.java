import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		LocalDate d00 = LocalDate.now();
		LocalDateTime d01 = LocalDateTime.now();
		Instant d02 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		Instant d07 = Instant.parse("2202-08-20T02:30:25-03:00");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.systemDefault());
		
		System.out.println(d00.minusDays(7));
		
	}

}
