package Human;

public abstract class Human implements CanRun, CanSwim {

    public void slowly_run() {
        System.out.println("Loooooooooooow(");
    }

    public void quickly_run() {
        System.out.println("Fast!");
    }

    public void slowly_swim() {

        System.out.println("Looooow");
    }

    public void quickly_swim() {

        System.out.println("My name is Michael Phelps");
    }
}
