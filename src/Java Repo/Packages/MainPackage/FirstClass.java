package Packages.MainPackage;

public class FirstClass {


    int students ;
    int weeks ;
    int days ;

    public static void main(String[] args) {
        System.out.println("Hello from main FristClass !");

        // Create Object from current Class, to use the object variables
        FirstClass fClass = new FirstClass();

        int totalDays;

        //Call object variables
        fClass.students = 10;
        fClass.weeks = 4;
        fClass.days = 3 ;

        totalDays = fClass.weeks * fClass.days;

        System.out.println("The English course is a total of " + totalDays + " days");

    }


    public void printLine (String name){
        System.out.println("Hello from printLine! " + name);
    }
}
