package Подарък;
import java.util.*;


	
	
	public class Подарък2 {
	    private String recipient;
	    private String occasion;
	    private String description;
	    private double price;
	    private double weight;

	    static Scanner sc = new Scanner(System.in);

	    public Подарък2 (String recipient, String occasion, String description, double price, double weight) {     
	        this.recipient = recipient;
	        this.occasion = occasion;
	        this.description = description;	
	        this.price = price;
	        this.weight = weight;
	        

	        System.out.println("[ВЪВЕДЕН] " + this);
	    }

	    public Подарък2() {
	    	  
			   System.out.println("\n" + "-----НОВ ПОДАРЪК-----" );
			   System.out.print("Описание на Вашия подарък: ");
			   this.description=sc.nextLine();
			   System.out.print("Получател на Вашия подарък: ");
			   this.recipient=sc.nextLine();
			   System.out.print("Повод на Вашия подарък: ");
			   this.occasion=sc.nextLine();
			   System.out.print("Цена на Вашия подарък: ");
			   this.price=sc.nextDouble();
			   System.out.print("Тегло на Вашия подарък: ");
			   this.weight=sc.nextDouble();
			  
			   System.out.println("\n" + "[ВЪВЕДЕН] " + this );
	    }

	    public void getInfo() {
	        System.out.printf("Подаръкът %s е за %s по повод%s, на цена %.2f лв и тежи %.3f kg.%n",
	        		description, recipient, occasion, price, weight);
	    }
	    

	    public Gift findMoreExpensive(Gift a) {
	        System.out.println("По-скъпият подарък от " + this.getDescription() +  " и " + a.getDescription() + " е:");
	        if (a.getPrice() < this.getPrice())
	            return this;
	        else
	            return a;
	    }

	    public Gift findLessExpensive(Gift a) {
	        System.out.println("По-евтиният подарък от " + this.getDescription() +  " и " + a.getDescription() + " е:");
	        if (a.getPrice() > this.getPrice())
	            return this;
	        else
	            return a;
	    }

	    public Gift findHeavier(Gift a) {
	        System.out.println("По-тежкият подарък от " + this.getDescription() +  " и " + a.getDescription() + " е:");
	        if (a.getWeight() < this.getWeight())
	            return this;
	        else
	            return a;
	    }

	    public Gift findLighter(Gift a) {
	        System.out.println("По-лекият подарък от " + this.getDescription() +  " и " + a.getDescription() + " е:");
	        if (a.getWeight() > this.getWeight())
	            return this;
	        else
	            return a;
	    }

	 

	    public static List<Gift> sortByWeight(List<Gift> list) {
	        System.out.println("---- Подаръците, сортирани по тегло: ----");
	        list.sort(Comparator.comparing(Gift::getWeight));
	        return list;
	    }

	    public static List<Gift> sortByFurstLetter(List<Gift> list) {
	        System.out.println("---- Подаръците, сортирани по азбучен ред на получатлите: ----");
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
	        return String.format("Подарък: " + this.getDescription() + "/ получател:" + this.getRecipient() + " / по повод: " + this.getOccasion() +
	                " / цена: " + String.format("%.2f", this.getPrice()) + " лв / тегло: " + this.getWeight() +
	                " kg" );
	    }
	}