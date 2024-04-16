package object;

public class Quiz1 {

	public static void main(String[] args) {
		
		Date date1 = new Date(2024, 4, 16);
		Date date2 = new Date(2024, 4, 16);
		Date date3 = new Date(2024, 4, 16);
		Date date4 = new Date(2024, 4, 17);
		
		if (date1.equals(date2)) {
			System.out.println("date1와 date2는 같은 날짜입니다.");
		} else {
			System.out.println("date1와 date2는 다른 날짜입니다.");
		}
		if (date3.equals(date4)) {
			System.out.println("date3와 date4는 같은 날짜입니다.");
		} else {
			System.out.println("date3와 date4는 다른 날짜입니다.");
		}
		
	}

}

class Date {
	
	int year;
	int month;
	int day;
	
	public Date(int year, int month, int date) {
		super();
		this.year = year;
		this.month = month;
		this.day = date;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Date) {
			Date date  = (Date) obj;
			
			if (this.year == date.year && this.month == date.month && this.day == date.day) {
				return true;
			}
		}
		return false;
	}
	
}


