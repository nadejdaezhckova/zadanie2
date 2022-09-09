public class Cat extends Animal {
        String name;
        public Cat(String name, String food, String location) {
            super(name, food, location);
            this.name = name;
        }

        @Override
        public void makeNoise() {
            System.out.println("мяу мяу");
        }

        @Override
        public void eat() {
            System.out.println("кошка кушает");
        }
    }

