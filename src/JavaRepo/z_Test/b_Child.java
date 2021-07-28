package z_Test;

public class b_Child extends a_Parent {

    void method ( ){
        System.out.println("I'm child");
    }


    public static void main(String[] args) {

        // Not inheritance
        a_Parent obj = new a_Parent();
        obj.method();

        // inheritance
        a_Parent obj2 = new b_Child();
        obj2.method();

        // will not work
       // child obj3 = new Parent();
        // obj3.method();

    }

}
