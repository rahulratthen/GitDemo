package testExamples;

public class Multiple3Pyramid {

	public static void main(String[] args)
	{
		int number = 0;
		for(int i=1;i<4;i++)

		{
			for(int j=0;j<i;j++)
			{
				
				number = number+3;
				System.out.print(number+"\t");
				
			}
			
			System.out.println("");
		}


	}

}
