package a_Packages.MainPackage;

public class b_SecondClass {
    public static void main(String[] args) {

        a_FirstClass fClass = new a_FirstClass();

        // need object to reach this method
        fClass.printLine("Ekram");

        //use class name becouse its static method
        a_FirstClass.main(args);

    }
}
