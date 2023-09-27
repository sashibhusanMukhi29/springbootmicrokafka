package org.dsa;

import java.util.Arrays;

public class MergeTwoSortedArray {
	
	public static void main(String[] args) {
		int[] arr1= {1,2,5,4,3};
		int [] arr2= {6,9,10,7,8};
	
		for(Integer data:mergeSortedArray(arr1, arr2))
		{
			System.out.println(data);
		}
	}
 static int[] mergeSortedArray(int [] arr1,int [] arr2)
 {
	 Arrays.sort(arr1);
	 Arrays.sort(arr2);
	 int []mergedArr= new int[arr1.length+arr2.length];
	 for(int i=0;i<arr1.length;i++)
	 {
		 mergedArr[i]=arr1[i];
	 }
	 int count=0;
	 for(int j=0;j<arr2.length;j++)
	 {
		 
		 mergedArr[arr1.length+j]=arr2[count++];
		
	 }
	return mergedArr;
 }
}
