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
        if (putloc < 100) {
            array[putloc] = b;
            putloc = putloc + 1;
        }
    }

    Object get() {
        if (getloc < 100) {
            getloc = getloc + 1;
        }
        return array[getloc];
    }
}