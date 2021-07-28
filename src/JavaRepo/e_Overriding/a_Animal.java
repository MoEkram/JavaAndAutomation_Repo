package e_Overriding;

//Overriding = if class inherits a methods from super class,
//             then override the method that is not market as final
//             to make different functionality with same method name

// Rules    -   Arguments & return type should be exactly the same
//          -   if super class is public, sub class can't be private or protected
//          -   final method can't be overridden
//          -   static method can't be overridden, but can be re-declared.
//          -   constructors can't be overridden

class a_Animal {

    public void move (){
        System.out.println("Animal can move");
    }

}

class Dog extends a_Animal {

    public void move (){
        System.out.println("Dog can move");
    }
}

class testDog {

    public static void main(String args[])
    {
        a_Animal animal = new a_Animal();
        Dog doggy = new Dog();

        animal.move();
        doggy.move();
    }

}

