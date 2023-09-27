package org.dsa.day4;

import java.util.HashSet;

public class RemoveDuplicateElementInAnArray {
public static void main(String[] args) {
	int[]arr= {20,10,20,30,30,40,40};
	for(int num:removeDuplicateEement(arr))
	{
		System.out.println(num);
	}
}
static int[] removeDuplicateEement(int [] arr)
{
	HashSet<Integer>removeDuplicateElement= new HashSet<>();
for(int i=0;i<arr.length;i++)
{
	removeDuplicateElement.add(arr[i]);
}
	int [] arr1= new int[removeDuplicateElement.size()];
	int count=0;
	for(Integer i :removeDuplicateElement)
	{
		arr1[count++]=i;
	}
	return arr1;
}
}
