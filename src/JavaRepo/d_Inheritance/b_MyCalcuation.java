package d_Inheritance;

public class b_MyCalcuation extends a_Calculation
{
	public void muliplication(int fNum , int secNum) 
	{
		total = fNum * secNum ; 
		System.out.println("The prodcut of the given numbers:" + total);
	}
	
	public static void main(String[] args) {
		b_MyCalcuation myCalc = new b_MyCalcuation() ;
		myCalc.addition(5, 6);
		myCalc.Subtraction(10, 5);
		myCalc.muliplication(5, 5);
	}

}
