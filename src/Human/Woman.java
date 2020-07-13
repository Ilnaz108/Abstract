package Human;

public class Woman extends Human {
    @Override
    public void slowly_run() {
        super.slowly_run();
        System.out.println("Ruun!");
    }

    @Override
    public void slowly_swim() {
        super.slowly_swim();
        System.out.println("Swiim!");
    }
}
