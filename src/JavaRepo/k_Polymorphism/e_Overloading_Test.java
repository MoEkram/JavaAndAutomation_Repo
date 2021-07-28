package k_Polymorphism;

public class e_Overloading_Test {

    public static void main(String[] args) {
        d_Overloading obj = new d_Overloading();

        double result;

        obj.demo(1);
        obj.demo(1,2);
        result = obj.demo(5.5);

        System.out.println("restult : " + result);

    }
}
