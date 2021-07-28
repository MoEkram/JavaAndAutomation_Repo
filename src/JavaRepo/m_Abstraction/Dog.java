package m_Abstraction;

// sub-class extended from abstracted class
public class Dog extends Animal{


    void sound() {
        System.out.println("Woof");
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
    }
}
