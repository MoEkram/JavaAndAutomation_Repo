package h_Encapsulation;

// Encapsulation = data hiding, no one should be able to reach the inside values
//                 by declare the variables of class as private
//                  & provide Setters and Getters to handle these variables

public class Encapsulation {
    private String name;
    private int idNum;
    private int age;

    public String getName(){
        return name;
    }
    public int getIdNum(){
        return idNum;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setIdNum(int idNum){
        this.idNum = idNum;
    }

    public void setAge(int age){
        this.age = age;
    }


}