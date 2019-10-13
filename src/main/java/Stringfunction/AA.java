package Stringfunction;

public class AA {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am Learning Java";
String[]s = str.split(" ");
String result= " ";
for (int i = s.length-1; i>=0 ; i--)
{
	result = result + s[i] + " ";
}
	System.out.println(result);
	}

}
