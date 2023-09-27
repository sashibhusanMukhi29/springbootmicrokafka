package org.dsa.day4;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class FindSmallestAndSecondSmallest {
	public static void main(String[] args) {
    int [] arr= {0,5,8,2,6,9,5,6,2,6};
    for(int num:getSmallestAndSecondSmallestElement(arr))
    {
    	   System.out.println(num);
    }
 
	}

	static int[] getSmallestAndSecondSmallestElement(int[] arr) {
		Arrays.sort(arr);
		Set<Integer> arrSet = new TreeSet<>();
		for (int i = 0; i < arr.length; i++) {
			arrSet.add(arr[i]);
		}
		int newArr[]= new int[2];
		int count=0;
	for(int num:arrSet)
	{
		if(count<2)
		{
			newArr[count++]=num;
		}
		else {
			break;
		}
	}
		return newArr;

	}
}
