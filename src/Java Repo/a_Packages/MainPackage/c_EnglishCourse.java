package a_Packages.MainPackage;

public class c_EnglishCourse {

    int students ;
    int weeks ;
    int days ;

    public static void main(String[] args) {

        // Create Object from current Class, to use the object variables
        c_EnglishCourse englishObject = new c_EnglishCourse();

        int totalDays;

        //Call object variables
        englishObject.students = 10;
        englishObject.weeks = 4;
        englishObject.days = 3 ;

        totalDays = englishObject.weeks * englishObject.days;

        System.out.println("The English course is a total of " + totalDays + " days");

    }
}
