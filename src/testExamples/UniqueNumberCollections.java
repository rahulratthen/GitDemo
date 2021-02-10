package testExamples;

import java.util.ArrayList;
import java.util.HashSet;


public class UniqueNumberCollections {

	public static void main(String[] args) 
	{
		int a[] = {4,5,3,4,5,3,5,6,6,8,4,3,5};
		
		int count;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int b: a)
		{
			list.add(b);
		}
		
		HashSet<Integer> sets1 = new HashSet<Integer>(list);
		
		
		ArrayList<Integer> uniqueList = new ArrayList<Integer>(sets1);
		for(int i=0;i<uniqueList.size();i++)
		{
			int value = uniqueList.get(i);
			count = 0;
			for(int j=0;j<list.size();j++)
			{
				
				if(value==list.get(j))
				{
					count=count+1;
					
				}				
			}
			System.out.println(value + "-" +count);
		}
		
	}

}
