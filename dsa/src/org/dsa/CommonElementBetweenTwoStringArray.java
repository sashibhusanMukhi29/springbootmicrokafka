package org.dsa;

import java.util.LinkedHashSet;
import java.util.Set;

public class CommonElementBetweenTwoStringArray {
 public static void main(String[] args) {
	 String [] arr1= {"sashi","UV","asd"};
	 String [] arr2= {"poiu","gbv","sashi","uV","asd"};
	for(String data :getCommonElementBetweenTwoStringArray(arr1, arr2))
	{
		System.out.print(data+" ,");
	}
}
 
static Set<String> getCommonElementBetweenTwoStringArray(String[] arr1,String []arr2)
{
	Set<String>commomELement=new LinkedHashSet<>();
	for(int i=0;i<arr1.length;i++)	
	{
	  for(int j=0;j<arr2.length;j++)
	  {
		  if(arr1[i].equalsIgnoreCase(arr2[j]))
		  {
			  commomELement.add(arr1[i]);
		  }
	  }
	  
	  }
	
	return commomELement;
	
}
}

