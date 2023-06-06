package Animal;

	abstract class Animal {
	    private String name;
	    private int age;
	    private double weight;
	    private char sex;
	    
	    public Animal (String name, int age, double weight, char sex) {
	    	this.name=name;
	    	this.age=age;
	    	this.weight=weight;
	    	this.sex=sex;
	    }
	    
	    
	    abstract void eat();
	    abstract void action();
	    
	    
	    @Override
	    public String toString() {
	        return String.format("%s е на %d г., тежи %d кг. и е от %s пол." , this.getName(), this.getAge(),this.getWeight(), this.getSex());
	    
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

		public double getWeight() {
			return weight;
		}

		public void setWeight(double weight) {
			this.weight = weight;
		}

		public char getSex() {
			return sex;
		}

		public void setSex(char sex) {
			this.sex = sex;
		}

		void sing() {
			// TODO Auto-generated method stub
			
		}

		
	    
	  
}
