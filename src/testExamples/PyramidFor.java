package testExamples;

public class PyramidFor {

	public static void main(String[] args) 
	{
		int value = 1;
		for(int i=0;i<4;i++)

		{
			for(int j=1;j<5-i;j++)
			{
				
				System.out.print(value+"\t");
				value++;
			}
			
			System.out.println("");
		}

	}

}

