public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion() {
            @Override
            public void walk() {
            }
        };
        lion.setName("Simba");
        lion.setWeight(60);
        lion.setBreed("White Lion");
        lion.setSkinColor("White");

        System.out.println("Animal Name: " + lion.getName());
        System.out.println("Breed: " + lion.getBreed());
        System.out.println("Color: " + lion.getSkinColor());
        System.out.println("Weight: " + lion.getWeight());
        System.out.println("");
        System.out.println("Can do: ");
        lion.walkable();
        lion.makeSound();
        lion.eat();
        System.out.println("");
        System.out.println("");

        Penguin penguin = new Penguin() {
            @Override
            public void walk() {
            }

            @Override
            public void swim() {

            }
        };
        penguin.setName("Penguin");
        penguin.setBreed("Magellanic Penguin");
        penguin.setSkinColor("White");
        penguin.setWeight(10);
        System.out.println("Animal Name: " + penguin.getName());
        System.out.println("Breed: " + penguin.getBreed());
        System.out.println("Color: " + penguin.getSkinColor());
        System.out.println("Weight: " + penguin.getWeight());
        System.out.println("");
        System.out.println("Can do: ");
        penguin.walkable();
        penguin.swimmable();
        penguin.makeSound();
        penguin.eat();
        System.out.println("");
        System.out.println("");

        Cat cat = new Cat() {
            @Override
            public void walk() {
            }
        };
        cat.setName("Cat");
        cat.setBreed("Persian");
        cat.setSkinColor("Yellow-Gold");
        cat.setWeight(8);
        System.out.println("Animal Name: " + cat.getName());
        System.out.println("Breed: " + cat.getBreed());
        System.out.println("Color: " + cat.getSkinColor());
        System.out.println("Weight: " + cat.getWeight());
        System.out.println("");
        System.out.println("Can do: ");
        cat.walkable();
        cat.makeSound();
        cat.eat();
        System.out.println("");
        System.out.println("");

        Dog dog = new Dog() {
            @Override
            public void walk() {
            }
        };
        dog.setName("Dog");
        dog.setBreed("Labrador");
        dog.setSkinColor("Black");
        dog.setWeight(15);
        System.out.println("Animal Name: " + dog.getName());
        System.out.println("Breed: " + dog.getBreed());
        System.out.println("Color: " + dog.getSkinColor());
        System.out.println("Weight: " + dog.getWeight());
        System.out.println("");
        System.out.println("Can do: ");
        dog.walkable();
        dog.makeSound();
        dog.eat();
        System.out.println("");
        System.out.println("");

        Cockroch cockroch = new Cockroch(){
            @Override
            public void crawl(){
            }
            @Override
            public void fly(){
            }
        };
        cockroch.setName("Cockroch");
        cockroch.setBreed("Hissing Cockroch");
        cockroch.setSkinColor("Black");
        cockroch.setWeight(1);
        System.out.println("Animal Name: " + cockroch.getName());
        System.out.println("Breed: " + cockroch.getBreed());
        System.out.println("Color: " + cockroch.getSkinColor());
        System.out.println("Weight: " + cockroch.getWeight());
        System.out.println("");
        System.out.println("Can do: ");
        cockroch.crawlable();
        cockroch.flyable();
        cockroch.makeSound();
        cockroch.eat();
        System.out.println("");
        System.out.println("");


    }
}
