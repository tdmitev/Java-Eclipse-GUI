package AnimalInterface;

class AnimalKingdom {
    public static void main(String[] args) {
        Animal a = new Dog("Ñàìè", 2);
        Cat c = new Cat("Êàòè", 4);

        System.out.println("–––– Êó÷å ––––");
        Trainer trainer = new Trainer(a);
        trainer.train();

        System.out.println("–––– Êîòêà ––––");
        trainer.setAnimal(c);
        trainer.train();
    }
}