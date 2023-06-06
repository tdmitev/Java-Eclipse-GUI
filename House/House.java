package House;

import java.util.Scanner;

public class House {
	static Scanner sc = new Scanner(System.in);
	private double area;
	
	public House (double area) {
		this.area=area;
	}
public double PriceArea(double p) {
	return this.area*p;
}
}
