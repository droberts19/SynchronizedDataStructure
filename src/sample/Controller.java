package sample;

public class Controller {

    // Fields
    Object[] array;
    int putloc = 0;
    int getloc = 0;

    // Constructors
    Controller() {
        array = new Object[100];
    }

    // Methods
    public void put(Object b) {
        if (putloc == 100) {
            System.out.println("put failed; please get() some");
            return;
        }
        if (putloc < 100) {
            putloc = putloc + 1;
            array[putloc] = b;
        }
    }

    Object get() {
        if (getloc < 100) {
            getloc = getloc + 1;
        } else {
            System.out.println("get failed; please put() some");
            putloc = 0;
        }
        return array[getloc];
    }
}