package AnimalInterface;

class AnimalKingdom {
    public static void main(String[] args) {
        Animal a = new Dog("����", 2);
        Cat c = new Cat("����", 4);

        System.out.println("���� ���� ����");
        Trainer trainer = new Trainer(a);
        trainer.train();

        System.out.println("���� ����� ����");
        trainer.setAnimal(c);
        trainer.train();
    }
}