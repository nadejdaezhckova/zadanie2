public class Horse extends Animal {
    String name;
    public Horse(String name, String food, String location) {
        super(name, food, location);
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("иго го");
    }

    @Override
    public void eat() {
        System.out.println("лошадь кушает");
    }
}
