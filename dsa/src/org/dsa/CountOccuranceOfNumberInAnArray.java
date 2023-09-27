package org.dsa;

import java.util.HashMap;
import java.util.Map.Entry;

public class CountOccuranceOfNumberInAnArray {
public static void main(String[] args) {
	int numArr[] = { 1,2,6,1,0,2,4};
	HashMap<Integer, Integer> occuranceOfNumberInAnArray = getOccuranceOfNumberInAnArray(numArr);
	for(Entry<Integer, Integer> i : occuranceOfNumberInAnArray.entrySet())
	{
		System.out.println(i.getKey()+" : "+i.getValue());
	}
}
static HashMap<Integer,Integer> getOccuranceOfNumberInAnArray(int [] arr) {
	
	
	HashMap<Integer,Integer>getAllIntegers= new HashMap<>();
	for(int i=0;i<arr.length;i++)
	{
		int count=0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				count++;
			}
			getAllIntegers.put(arr[i],count);
		}
		
	}
	return getAllIntegers;
	
	
}
}
