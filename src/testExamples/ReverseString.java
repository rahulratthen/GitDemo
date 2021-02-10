package testExamples;

public class ReverseString {

	public static void main(String[] args) 
	{
		String newStr ="";
		String name = "abirami";
		System.out.println(name.length());
		for(int i=name.length()-1;i>-1;i--)
		{
			newStr = newStr + name.charAt(i);
			
		}
		
		System.out.println(newStr);
	}

}
