package AnimalInterface;

class AnimalKingdom {
    public static void main(String[] args) {
        Animal a = new Dog("ัเ์่", 2);
        Cat c = new Cat("สเ๒่", 4);

        System.out.println(" ส๓๗ๅ ");
        Trainer trainer = new Trainer(a);
        trainer.train();

        System.out.println(" ส๎๒๊เ ");
        trainer.setAnimal(c);
        trainer.train();
    }
}