package Animal;

public class Test {

	 public static void main(String[] args) {
	        Bird b = new Bird("Кики", 1, 1.15, "М", true);
	        Lion a = new Lion("Лоли", 6, 115, "Ж");

	        b.eat();
	        a.action();

	        System.out.println();
	        
	        
	        System.out.println(b);
	        System.out.println(a);
	    }
	}