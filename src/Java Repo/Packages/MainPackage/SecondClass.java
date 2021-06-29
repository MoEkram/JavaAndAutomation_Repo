package Packages.MainPackage;

import Packages.MainPackage.FirstClass;

public class SecondClass {
    public static void main(String[] args) {

        FirstClass fClass = new FirstClass();

        // need object to reach this method
        fClass.printLine("Ekram");

        //use class name becouse its static method
        FirstClass.main(args);

    }
}
