package Animal;

   public abstract class Bird extends Animal {
	   private boolean jump;
		public Bird (String name, int age, double weight, char sex, boolean jump) {
			super (name, age, weight, sex);
			this.jump=jump;
		}

		 @Override
		    void action() {
		        System.out.printf("�������� %s �� %d �. ���� � 20 ��/�!%n", this.getName(), this.getAge());
		    }

		    @Override
		    void eat() {
		        System.out.printf("�������� %s �� %d �. ��� ����!%n", this.getName(), this.getAge());
		    }

		    @Override
		    public String toString() {
		        return "��������" + super.toString() + String.format(" �� %s �����.", this.jump ? "" : "��");
		    }
		}