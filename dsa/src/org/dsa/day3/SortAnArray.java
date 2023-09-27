package org.dsa.day3;

import java.util.Arrays;

public class SortAnArray {
	public static void main(String[] args) {
		int[]arr= {1,8,2,10,4,7,5,81,9};
		for(Integer i :getSortedArray( arr) )
		{
			System.out.println(i);
		}
	}
public static int[] getSortedArray(int[] arr)
{
	Arrays.sort(arr);
	
	int arr1[]=new int[arr.length/2];
	int arr2[]= new int[arr.length-arr1.length];
	for(int i=0;i<arr.length/2;i++)
	{
		arr1[i]=arr[i];
	}
	return arr1;
}
		
}
