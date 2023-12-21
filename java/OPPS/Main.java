package OPPS;

import OPPS.interfaces.Human;

public class Main implements Human {

    public static void main(String[] args) {
        Main obj = new Main();
        obj.hello();
    }

    @Override
    public void hello() {
        System.out.println("Hello world!");
    }
}
