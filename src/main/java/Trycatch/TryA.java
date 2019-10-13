package Trycatch;

public class TryA {
int x = 10;
Double y = 20.5;

	public void sum() {
		// TODO Auto-generated method stub
try {
	Double z = x + y;
	System.out.println(z);	
}
catch(ArithmeticException b)
{
	System.out.println("Arithematic occurs");
}
		/*
		 * catch(IOException c) { System.out.println("IOException occurs"); }
		 */
catch(Exception a)
{
	System.out.println("Exception occurs");
}

	}

}
