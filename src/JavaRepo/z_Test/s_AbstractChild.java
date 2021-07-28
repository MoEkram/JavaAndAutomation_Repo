package z_Test;

public class s_AbstractChild  extends c_AbstractParent {

    // implement Abstracted method
    void method (){
        System.out.println("I'm implemented method in child class for abstracted method in parent class");
    }

    void method ( String name ){
        System.out.println("I'm the method in child class" + name );
    }




    public static void main(String[] args) {

        // Abstract class can't be implemented
        // c_AbstractParent obj = new c_AbstractParent();
        // obj.method();
        // obj.method("Ekram");

        //
         c_AbstractParent obj = new s_AbstractChild();
      // obj.method();                // badehy will run implementation inside child
         obj.method("Ekram");   // badehy bardak

    }

}
