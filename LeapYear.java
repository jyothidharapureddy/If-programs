package if_programs;

public class LeapYear {

	public static void main(String[] args) {
		int y=1985;
		if(y%4==0 || y%400==0 && y%100!=0) {
			System.out.println(" its leap year");
		}
		else {
			System.out.println(" its not leap year");
		}
	}

}
