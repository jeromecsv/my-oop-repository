public class Main {
    public void main(String[] args) {

        Lion lion = new Lion() {
            @Override
            public void walk() {
            }
        };

        lion.setName("Simba");
        lion.setSkinColor("White");
        lion.setBreed("White Lion");
        lion.setWeight(60);

        System.out.println(lion.getName());

    }
}
