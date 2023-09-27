package org.dsa;

public class ReverseOFAnArray {
 public static void main(String[] args) {
		int numArr[]={3,2,5,6,4,8,9,7,1,0,1,25,74,0,01,0};

	 for(Integer i : getReverseOfAnArray(numArr))
	 {
		 System.out.println(i);
	 }
}
 
 static int[] getReverseOfAnArray(int [] arr)
 {
	 int count=0;
	int reverArr[]=new int[arr.length];
	 for(int i =arr.length-1;i>=0;i--)
	 {
		 
		
		reverArr[count++]=arr[i];
	 }
	 return reverArr;
 }
}
