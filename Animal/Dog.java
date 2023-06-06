package AnimalInterface;

public class Dog extends Animal{
	private String name;
	private int age;
	
	public Dog(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}

	public void showInfo() {
		System.out.printf("Името ми е %s и съм на %d години." + this.name, this.age);
	}
	@Override
	public String doNoise() {
		return "Бал";
	}
	
	@Override
	public String doTrick() {
		return "Ще легна";
	}
	
	@Override
	void perform() {
		System.out.println(doNoise());
		System.out.println(doTrick() + "\n");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
