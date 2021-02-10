package testExamples;

public class Demo2 {

	public static void main(String[] args) {
		int a[] = {4,5,3,4,5,3,5,6,6,8,4,3,5};
		int count[] = {0,0,0,0,0,0,0,0,0,0};
		for(int b : a) {
			count[b] = count[b]+1;
		}
		
		for(int i=0; i<count.length; i++) {
			if(count[i] != 0) {
				System.out.println((i) + "->" + count[i]);
			}
		}

	}

}
