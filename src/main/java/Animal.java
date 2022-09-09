public class Animal {
        String name;
        String food;
        String location;

        public Animal(String name, String food, String location) {
            this.name = name;
            this.food = food;
            this.location = location;
        }

        public void makeNoise() {
            System.out.println("шумит");
        }

        public void eat() {
            System.out.println("кушает");
        }

        public void sleep() {
            System.out.println("спит");
        }
    }

