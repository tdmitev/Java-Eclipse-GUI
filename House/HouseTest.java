package House;

public class HouseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House home= new House(80);
		home = new Home (80, 60);
		System.out.println("������ �� ���� ��� ���� �: " + home.PriceArea(100) + "�2");
		System.out.println("������ �� ���� � ���� �: " + House.PriceArea(100) + "�2");
	}

}
