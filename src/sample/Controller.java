package sample;

public class Controller {

    // Fields
    Object[] array;
    int putloc = 0;

    // Constructors
    Controller() {
        array = new Object[100];
    }

    // Methods
    synchronized boolean put(Object b) {
        if (putloc < 100) {
            array[putloc] = b;
            putloc = putloc + 1;
        } else {
            System.out.println("put failed; please get() some");
            return true;
        }
        return false;
    }

    Object get() {
        if (putloc > 0) {
            putloc = putloc - 1;
        } else {
            System.out.println("get failed; please put() some");
        }
        return array[putloc];
    }
}