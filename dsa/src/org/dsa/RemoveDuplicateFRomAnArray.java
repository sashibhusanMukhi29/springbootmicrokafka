package org.dsa;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFRomAnArray {
	public static void main(String[] args) {
		int numArr[]={3,2,5,6,4,8,9,7,1,0,1,25,74,0,01,0};

		 System.out.println( removeDuplicateElementFromAnArray(numArr).toString());
	}


static Set<Integer> removeDuplicateElementFromAnArray(int []numArr)
{
	
	Set<Integer>nonRepeatateiveElement= new HashSet<>();
	for(int i=0;i<numArr.length;i++)
	{
		nonRepeatateiveElement.add(numArr[i]);
		
	}
	return  nonRepeatateiveElement;
}
	
}