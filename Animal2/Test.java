package Animal;

public class Test {

	 public static void main(String[] args) {
	        Bird b = new Bird("����", 1, 1.15, "�", true);
	        Lion a = new Lion("����", 6, 115, "�");

	        b.eat();
	        a.action();

	        System.out.println();
	        
	        
	        System.out.println(b);
	        System.out.println(a);
	    }
	}