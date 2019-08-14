package IBM_1308;

import java.util.Arrays;

public class ArrayDemo {

	private int  arr[]= {
			100,1,-20,30,0
	};
	/*public ArrayDemo() {
		
	}
	public void createArray(int length) {
		arr=new char[length];
		for (int i=0;i<arr.length;i++) {
			arr[i]=(char)('A'+i);
		}
	}
	public char[] getArray() {
		return arr;
	}*/
	public void search(int x) {
	  for(int i=0;i<arr.length;i++) {
		  if(arr[i]==x) {
			  System.out.println("value found: " +x);
			  break;
		  }
	  }
	  }
	public boolean findElement(int item) {
		int i=Arrays.binarySearch(arr, item);
		if(i>=0) {
			return true;
		}
		else {
			return false;
		}
	}
}
