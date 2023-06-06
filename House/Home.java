package House;

public class Home extends House{
	private double b;
	public Home (double area, double b) {
		super (area);
		this.b=b;
		
	}
 @Override
public double PriceArea(double p) {
	 return super.PriceArea(p) + this.b*p;
 }
}
