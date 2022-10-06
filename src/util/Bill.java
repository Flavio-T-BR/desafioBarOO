package util;

public class Bill {
	
	public char gender;
	public int beer;
	public int softDrink;
	public int barbecue;
	
	
	public static double feeding (int beer, int softDrink, int barbecue) {
		return beer * 5.00 + softDrink * 3.00 + barbecue * 7.00;
	}
	
	public static double cover(double feeding) {
		if (feeding < 30.00) {
			return 4.00;
		} else {
			return 0.00;
		}
	}
	
	public static double ticket(char gender) {
		if (gender == 'F') {
			return 8.00;
		} else {
			return 10.00;
		}
	}
	
	public static double total(double cover, double feeding, double ticket) {
		return cover + feeding + ticket;
	}

}
