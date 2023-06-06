package Animal;

   public abstract class Bird extends Animal {
	   private boolean jump;
		public Bird (String name, int age, double weight, char sex, boolean jump) {
			super (name, age, weight, sex);
			this.jump=jump;
		}

		 @Override
		    void action() {
		        System.out.printf("ѕтичката %s на %d г. лети с 20 км/ч!%n", this.getName(), this.getAge());
		    }

		    @Override
		    void eat() {
		        System.out.printf("ѕтичката %s на %d г. €де хл€б!%n", this.getName(), this.getAge());
		    }

		    @Override
		    public String toString() {
		        return "ѕтичката" + super.toString() + String.format(" “€ %s скача.", this.jump ? "" : "не");
		    }
		}