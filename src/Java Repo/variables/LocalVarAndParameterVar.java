package variables;

public class LocalVarAndParameterVar {


	// --> Local Variables		declaration inside the method ( not reachable from outside the method )
	//							just call it by its name

	// --> Parameter Variable	declaration inside () of the method  ( work only inside the method ) can't create local variable with same name
	// --> Argument 			when pass a value to method contains Parameter variable

	public void testLocalVariable() 
	{
		// Local variable
		int age = 34 ; 
		System.out.println("How old are you ?" + age);
	}
	
	public void testSameLocalVariable() 
	{
		// Local variable with same name
		int age = 38 ; 
		System.out.println("How old are you ?" + age);
	}

	// Parameter Variable
	public void testParameterVariable(int age) 
	{
		System.out.println("My age is : " + age + " Years old");
	}
	
	public static void main(String[] args) {
		LocalVarAndParameterVar localVar = new LocalVarAndParameterVar();
		localVar.testLocalVariable();
		localVar.testSameLocalVariable();

		// Argument
		localVar.testParameterVariable(40);

	}

}
