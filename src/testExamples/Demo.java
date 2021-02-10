package testExamples;

import java.util.ArrayList;
import java.util.Collections;

public class Demo implements Comparable<Demo>{

	String name;
	int rollNo;
	public Demo(String name,int rollNo)
	{
		this.name = name;
		this.rollNo = rollNo;
		
	}
	
	public static void main(String[] args) 
	{
		Demo obj1 = new Demo("Abirami",1);
		Demo obj2 = new Demo("b",2);
		Demo obj3 = new Demo("c",3);
		Demo obj4 = new Demo("d",4);
		Demo obj5 = new Demo("e",5);
		
		ArrayList<Demo> list1 = new ArrayList<Demo>();
		list1.add(obj1);
		list1.add(obj2);
		list1.add(obj3);
		list1.add(obj4);
		list1.add(obj5);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("1");
		list2.add("2");
		list2.add("3");
		
		Collections.sort(list1);
		for(Demo a:list1)
		{
		System.out.println(a.name);
		}
	}

	@Override
	public int compareTo(Demo o) {
		if(rollNo < o.rollNo) {
			return -1;
		}
		else if (rollNo > o.rollNo) {
			return 1;
		}
		return 0;
	}


}
