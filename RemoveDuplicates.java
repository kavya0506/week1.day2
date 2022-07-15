package week1.day2;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] num= {3,6,7,4,6};
		 Arrays.sort(num);
		 for(int i=0;i<num.length-1;i++) {
			 if(num[i]==num[i+1]) {
				 System.out.println(+num[i]);
			 }
		 }
	}
}

