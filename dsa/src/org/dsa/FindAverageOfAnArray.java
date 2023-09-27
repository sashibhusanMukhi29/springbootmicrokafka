package org.dsa;

public class FindAverageOfAnArray {
	public static void main(String[] args) {
		int numArr[] = { 3, 2, 5, 6, 4, 8, 9, 7, 1, 0, 1, 25, 74, 0, 01, 0 };
		System.out.println(getAverageOfAnArray(numArr));
		
	}
  static int getAverageOfAnArray(int arr[])
  {
	  int sum=0;
	  for(int i=0;i<arr.length;i++)
	  {
		  sum=sum+arr[i];
	  }
	return sum/arr.length;
  }
}
