package week_06.assignments;

public class Question_06_24 {
	public static void main(String[] args) {

		System.out.println("Current time and date is :   " + currentTimeDate());

	}
	public static String currentTimeDate() {
		long milliSeconds = System.currentTimeMillis();

		String currentTimeAndDate = currentTime(milliSeconds) + currentDate(milliSeconds);

		return currentTimeAndDate;
	}

	public static String currentTime(long milliSecond) {
		long totalMilliSeconds = milliSecond;
		long totalSeconds = totalMilliSeconds / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;

		return (currentHour % 12 + ":" + ((currentMinute < 10) ? "0" + currentMinute : currentMinute) +
				":" + currentSecond +
				((currentHour > 12) ? " PM" : " AM") + "    ");
	}

	public static String currentDate(long milliSeconds) {
		String date = getMonth(milliSeconds) + " / " +
				getDay(milliSeconds) + " / " + getYear(milliSeconds);

		return date;
	}

	public static int getYear(long milliSeconds) {
		long oneYearOfSeconds = 365 * 24 * 60 * 60; // milliseconds;
		int yearsPassed = (int) (milliSeconds / 1000 / oneYearOfSeconds);

		return yearsPassed + 1970;
	}



	public static int getMonth(long milliSeconds) {

		long oneYearOfSeconds = 365 * 24 * 60 * 60;
		int secondsLeftFromYear =(int)((milliSeconds / 1000) % oneYearOfSeconds);

		int currentMonth = (int) ((secondsLeftFromYear / (oneYearOfSeconds / 12)));

		return currentMonth;
	}


	public static int getDay(long milliSeconds) {

		long oneYearOfSeconds = 365 * 24 * 60 * 60;
		int secondsLeftFromYear =(int)((milliSeconds / 1000) % oneYearOfSeconds);
		int currentMonth = (int) ((secondsLeftFromYear / (oneYearOfSeconds / 12)));//Current month

		int yearsPassed = (int) (milliSeconds / 1000 / oneYearOfSeconds);
		int currentYear = 1970 + yearsPassed;//Current year

		int leftSecondsFromMonth= (int) (((milliSeconds / 1000) % oneYearOfSeconds) % oneYearOfSeconds / 12);

		return dayInMonth(leftSecondsFromMonth);
	}

	public  static int dayInMonth( int leftSecondFromMonth){

		return leftSecondFromMonth / (24 * 60 * 60);
	}

}