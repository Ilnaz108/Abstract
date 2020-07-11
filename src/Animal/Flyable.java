package Animal;

public interface Flyable {
    public void fly();

    Flyable fly = new Flyable() {
        @Override
        public void fly() {

        }
    };

}
