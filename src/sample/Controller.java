package sample;

public class Controller {

    // Fields
    Object[] array;
    int putloc = 0;
    int getloc = 0;
    boolean doiget = false;

    // Constructors
    Controller() {
        array = new Object[101];
    }

    // Methods
    public void put(Object b) {
        if (doiget == false) {
            if (putloc < 100) {
                putloc = putloc + 1;
                array[putloc] = b;
            } else {
                System.out.println("put failed; please get() some");
                doiget = true;
                putloc = 0;
            }
        }
    }

    Object get() {
        if (doiget == true) {
            if (getloc < 100) {
                getloc = getloc + 1;
            } else {
                System.out.println("get failed; please put() some");
                doiget = false;
                getloc = 0;
            }
        }
        return array[getloc];
    }
}