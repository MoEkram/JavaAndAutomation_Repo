package b_Variables;

public class d_StaticVar {

	// Class Variable			declaration inside Class not method, contains static word before it, ( called static variable )
	// 							you don't need to create object from it to use it
	// 							call it by call the class name ex: ClassStaticVar.age

	static int age = 25 ; 

	// Static method
	public static void testStatic() 
	{
		System.out.println("This is a static Method");
	}
	
	public static void main(String[] args) {

		// call static parameter
		System.out.println("Most people gradute from school at "+ d_StaticVar.age + " Years old");
		d_StaticVar.testStatic();
	}

}
