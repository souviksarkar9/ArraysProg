import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestFriday {

	public static void getLast(int yr, int mon, int day) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		
		for(int i=mon; i<=Calendar.DECEMBER; i++) {
			GregorianCalendar cal = new GregorianCalendar(yr, i, day);
			cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
			int diff = Calendar.FRIDAY - cal.get(Calendar.DAY_OF_WEEK);
			if(diff > 0)
				diff = diff - 7;
			
			cal.add(Calendar.DAY_OF_MONTH, diff);
			System.out.println(sdf.format(cal.getTime()));
			
		}
		
	}
	public static void main(String[] args) {
		getLast(2019,6,1);
	}

}
