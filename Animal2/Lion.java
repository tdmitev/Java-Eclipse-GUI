package Animal;

   public abstract class Lion extends Animal {

    public Lion(String name, int age, double weight, char sex) {
        super(name, age, weight, sex);
    }

    @Override
    void action() {
        System.out.printf("����� %s �� %d �. ���� � 55 ��/�!%n", this.getName(), this.getAge());
    }

    @Override
    void eat() {
        System.out.printf("����� %s �� %d �. ��� ����!%n", this.getName(), this.getAge());
    }

    @Override
    public String toString() {
        return "�����" + super.toString();
    }
}