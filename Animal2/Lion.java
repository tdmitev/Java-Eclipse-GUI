package Animal;

   public abstract class Lion extends Animal {

    public Lion(String name, int age, double weight, char sex) {
        super(name, age, weight, sex);
    }

    @Override
    void action() {
        System.out.printf("Ëתגתע %s םא %d ד. בÿדא ס 55 ךל/ק!%n", this.getName(), this.getAge());
    }

    @Override
    void eat() {
        System.out.printf("Ëתגתע %s םא %d ד. ÿהו לוסמ!%n", this.getName(), this.getAge());
    }

    @Override
    public String toString() {
        return "Ëתגתע" + super.toString();
    }
}