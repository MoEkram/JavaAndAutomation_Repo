package l_Constructor;

public class ConstructorOverloading {

    private String name;
    private int code;


    ConstructorOverloading(){
        System.out.println("Hello");
    }

    ConstructorOverloading(String Name){
        System.out.println("Hello " + Name);
    }

    ConstructorOverloading(String name, int code ){
        this.name = name;
        this.code = code;

        System.out.println("Hello " + this.name + " , " + this.code);
    }

}
