package House;

public class HouseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House home= new House(80);
		home = new Home (80, 60);
		System.out.println("Цената на къща без двор е: " + home.PriceArea(100) + "м2");
		System.out.println("Цената на къща с двор е: " + House.PriceArea(100) + "м2");
	}

}
