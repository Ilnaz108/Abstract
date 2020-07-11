package Animal;

interface Runnable {
    public void run();
    Runnable run = new Runnable() {
        @Override
        public void run() {
            System.out.println(run);
        }
    };
}