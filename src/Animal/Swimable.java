package Animal;

public interface Swimable {
    public void Swim();

    Swimable swim = new Swimable() {
        @Override
        public void Swim() {

        }

    };
}