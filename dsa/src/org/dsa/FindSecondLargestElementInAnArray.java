package org.dsa;

import java.util.Arrays;

public class FindSecondLargestElementInAnArray {
	public static void main(String[] args) {
		int numArr[] = { 3, 2, 5, 6, 4, 8, 9, 7, 1, 0, 1, 25, 74, 0, 01, 0 };
		System.out.println(getSecondLargestElement(numArr));
	}
	static int getSecondLargestElement(int [] arr )
	{
		Arrays.sort(arr);
		return arr[arr.length-2];
		
	}

}
