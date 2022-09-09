public class Dog extends Animal {
    String name;
    public Dog(String name, String food, String location) {
        super(name, food, location);
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("гав гав");
    }

    @Override
    public void eat() {
        System.out.println("собака кушает");
    }
}
