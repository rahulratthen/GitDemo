package testExamples;

public class MaximumNumber {

	public static void main(String[] args) {
		int array1[][] = {{2,4,6},{3,5,7},{0,9,8}};
		int row = array1.length;
		int col = array1[0].length;
		int maxVal = array1[0][0];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(array1[i][j]>maxVal)
				{
					maxVal=array1[i][j];
				}
				
			}
		}
		
		System.out.println(maxVal);
	}

	

}
