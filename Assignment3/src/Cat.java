public class Cat extends Animal implements Walkable {
    public void walkable() {
        System.out.println("Walking...Walking");
    }
    @Override
    public void eating() {
        System.out.println("I love Eating Fish");
    }
    @Override
    public void makeNoise() {
        System.out.println("Mweooow.. mweeoow..");
    }
}
