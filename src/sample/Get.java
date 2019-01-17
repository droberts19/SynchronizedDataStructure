package sample;

public class Get implements Runnable {

    Controller g;
    private int id;
    private int gets;

    Get(Controller get, int Id, int howMany) {
        g = get;
        id = Id;
        gets = howMany;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            boolean didGet = g.get(id);
        }
    }
}
