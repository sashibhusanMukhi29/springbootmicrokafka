package org.dsa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindSecondLargestElementIn {
 public static void main(String[] args) {
		Integer[] arr = { 1, 2, 5, 4, 8, 2, 8 };
	System.out.println(getSecondLargestElement(arr));
}
 static Integer getSecondLargestElement(Integer [] arr)
 {
	 Arrays.sort(arr);
	 Set<Integer>data= new HashSet<Integer>(Arrays.asList(arr)); 
	 Integer [] arr1 = new Integer[data.size()];
	data.toArray(arr1);
	return arr1[arr1.length-2];
	 
 }
}
