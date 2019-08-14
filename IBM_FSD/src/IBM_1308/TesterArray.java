package IBM_1308;

import java.util.Arrays;
import java.util.Collections;

public class TesterArray {

	public static void main(String[] args) {
		int arr[]= {
				100,1,-20,30,0
		};
      Arrays.sort(arr);
      System.out.println(Arrays.toString(arr));
      
      //Arrays.sort(arr,Collections.reverseOrder());
	  
	  ArrayDemo a=new ArrayDemo();
	  a.search(100);
	
	}
}
