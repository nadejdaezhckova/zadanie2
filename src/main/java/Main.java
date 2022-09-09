public class Main {
    public static void main(String[] ard) {
        Veterinarian veterinarian = new Veterinarian();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Лаки", "мясо", "в будке за домом");
        animals[1] = new Cat("Мотя", "рыба", "на кухне в доме");
        animals[2] = new Horse("Максимус", "сено", "на ферме");

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}
