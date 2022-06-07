public abstract class Penguin extends Animal implements Walkable, Swimmable{

//    public void walkable(){
//        System.out.println("Walking...Walking");
//    }

    public void swimmable(){
        System.out.println("Swim..Splash");
    }

    public void walkable() {
        System.out.println("Walking...Walking");
    }

    public abstract void walk();
    public abstract void swim();
}
