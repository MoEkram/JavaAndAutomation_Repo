package k_Polymorphism;

public class d_Overloading {
    public void demo ( int a ){
        System.out.println("a: " + a);
    }

    public void demo ( int a, int b ){
        System.out.println("a: " +  a + ", b: " + b);
    }


    public double demo ( double a ){
        System.out.println("a: " + a);
        return a*a;
    }
}
