package testExamples;

public class MinMaxArray {

	public static void main(String[] args)
	{
		int array1[][] = {{2,4,6},{3,0,7},{1,9,8}};
		int row = array1.length;
		int col = array1[0].length;
		int minimumVal = array1[0][0];
		
		int minCol = 0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(array1[i][j]<minimumVal)
				{
					minimumVal=array1[i][j];
					
					minCol=j;
				}
				
			}
		}
		int maxValCol = array1[0][minCol];
		for(int k=0;k<row;k++)
		{
			if(array1[k][minCol]>maxValCol)
			{
				maxValCol=array1[k][minCol];
			}
		}
		System.out.println(maxValCol);
		
	}

}
