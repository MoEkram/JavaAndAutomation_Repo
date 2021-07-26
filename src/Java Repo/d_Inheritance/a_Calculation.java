package d_Inheritance;

// Inheritance = adoption of all non-private variables & methods
// 				 of one class (superClass) to other class (subclass)
// Interfaces = define only the structure of the class members while inheritance include actual code

public class a_Calculation {

	int total ; 

	public void addition(int firstNum , int secondNum) 
	{
		total = firstNum + secondNum ; 
		System.out.println("The sum of the given numbers: " + total);
	}

	public void Subtraction(int firstNum , int secondNum) 
	{
		total = firstNum - secondNum ; 
		System.out.println("The difference between the given numbers: " + total);
	}

}
