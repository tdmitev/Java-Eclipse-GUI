package �������;
import java.util.*;


	
	
	public class �������2 {
	    private String recipient;
	    private String occasion;
	    private String description;
	    private double price;
	    private double weight;

	    static Scanner sc = new Scanner(System.in);

	    public �������2 (String recipient, String occasion, String description, double price, double weight) {     
	        this.recipient = recipient;
	        this.occasion = occasion;
	        this.description = description;	
	        this.price = price;
	        this.weight = weight;
	        

	        System.out.println("[�������] " + this);
	    }

	    public �������2() {
	    	  
			   System.out.println("\n" + "-----��� �������-----" );
			   System.out.print("�������� �� ����� �������: ");
			   this.description=sc.nextLine();
			   System.out.print("��������� �� ����� �������: ");
			   this.recipient=sc.nextLine();
			   System.out.print("����� �� ����� �������: ");
			   this.occasion=sc.nextLine();
			   System.out.print("���� �� ����� �������: ");
			   this.price=sc.nextDouble();
			   System.out.print("����� �� ����� �������: ");
			   this.weight=sc.nextDouble();
			  
			   System.out.println("\n" + "[�������] " + this );
	    }

	    public void getInfo() {
	        System.out.printf("��������� %s � �� %s �� �����%s, �� ���� %.2f �� � ���� %.3f kg.%n",
	        		description, recipient, occasion, price, weight);
	    }
	    

	    public Gift findMoreExpensive(Gift a) {
	        System.out.println("��-������� ������� �� " + this.getDescription() +  " � " + a.getDescription() + " �:");
	        if (a.getPrice() < this.getPrice())
	            return this;
	        else
	            return a;
	    }

	    public Gift findLessExpensive(Gift a) {
	        System.out.println("��-�������� ������� �� " + this.getDescription() +  " � " + a.getDescription() + " �:");
	        if (a.getPrice() > this.getPrice())
	            return this;
	        else
	            return a;
	    }

	    public Gift findHeavier(Gift a) {
	        System.out.println("��-������� ������� �� " + this.getDescription() +  " � " + a.getDescription() + " �:");
	        if (a.getWeight() < this.getWeight())
	            return this;
	        else
	            return a;
	    }

	    public Gift findLighter(Gift a) {
	        System.out.println("��-������ ������� �� " + this.getDescription() +  " � " + a.getDescription() + " �:");
	        if (a.getWeight() > this.getWeight())
	            return this;
	        else
	            return a;
	    }

	 

	    public static List<Gift> sortByWeight(List<Gift> list) {
	        System.out.println("---- ����������, ��������� �� �����: ----");
	        list.sort(Comparator.comparing(Gift::getWeight));
	        return list;
	    }

	    public static List<Gift> sortByFurstLetter(List<Gift> list) {
	        System.out.println("---- ����������, ��������� �� ������� ��� �� �����������: ----");
	        list.sort(Comparator.comparing(Gift::getRecipient));
	        return list;
	    }
	    
	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

	    public String getRecipient() {
	        return recipient;
	    }

	    public void setRecipient(String recipient) {
	        this.recipient = recipient;
	    }

	    public String getOccasion() {
	        return occasion;
	    }

	    public void setOccasion(String occasion) {
	        this.occasion = occasion;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public double getWeight() {
	        return weight;
	    }

	    public void setWeight(double weight) {
	        this.weight = weight;
	    }

	    @Override
	    public String toString() {
	        return String.format("�������: " + this.getDescription() + "/ ���������:" + this.getRecipient() + " / �� �����: " + this.getOccasion() +
	                " / ����: " + String.format("%.2f", this.getPrice()) + " �� / �����: " + this.getWeight() +
	                " kg" );
	    }
	}