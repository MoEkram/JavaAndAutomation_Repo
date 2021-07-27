package k_Polymorphism;

public class c_Horse_Overriding extends b_Animal_Overriding {

    @Override
    public void sound(){
        System.out.println("Neigh");
    }

    public static void main(String[] args) {
        b_Animal_Overriding animal = new b_Animal_Overriding();
        animal.sound();

        b_Animal_Overriding animal2 = new c_Horse_Overriding();
        animal2.sound();
    }
}
