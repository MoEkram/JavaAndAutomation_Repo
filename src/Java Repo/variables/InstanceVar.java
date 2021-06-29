package variables;

public class InstanceVar {


	// Instance Variable		declaration inside the class ( called Global variable )
	// 							just call it by its name


	// Instance Variable
	int age = 25 ; 

	public void testInstanceVar() 
	{

		System.out.println("Most poeple graduate from school at "+ age + " Years old");	
	}
	
	
	public void testInstanceVarAgain() 
	{
		// local variable override the instance variable ( the global variable )
		int age = 4;
		System.out.println("Most poeple graduate from school at "+ age + " Years old");
	}
	
	public static void main(String[] args) {
		InstanceVar instObj = new InstanceVar(); 
		instObj.testInstanceVar();
		instObj.testInstanceVarAgain();

	}

}
