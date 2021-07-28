package h_Encapsulation;

public class RunEncapsulation {

    public static void main(String[] args) {
        Encapsulation enc = new Encapsulation();
        enc.setName("Ekram");
        enc.setAge(35);
        enc.setIdNum(123456);

        System.out.println(enc.getName());
        System.out.println(enc.getAge());
        System.out.println(enc.getIdNum());

    }
}
