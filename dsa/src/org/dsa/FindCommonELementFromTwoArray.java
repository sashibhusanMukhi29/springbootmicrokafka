package org.dsa;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindCommonELementFromTwoArray {
	 public static void main(String[] args) {
		 int [] arr1= {1,2,3};
		int [] arr2= {2,5,2,1,8};
		for(Integer data :getFindCommonELementFromTwoArray(arr1, arr2))
		{
			System.out.print(data+" ,");
		}
	}
	 


	static Set<Integer> getFindCommonELementFromTwoArray (int[] arr1,int []arr2)
	{
		Set<Integer>commomELement=new LinkedHashSet<>();
		for(int i=0;i<arr1.length;i++)	
		{
		  for(int j=0;j<arr2.length;j++)
		  {
			  if(arr1[i]==(arr2[j]))
			  {
				  commomELement.add(arr1[i]);
			  }
		  }
		  
		  }
		
		return commomELement;
		
	}

}
