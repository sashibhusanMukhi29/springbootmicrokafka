package org.dsa.day4;

public class CheckForNumbers {
public static void main(String[] args) {
	int [] arr= {65,77};
	int [] arr1= {25,5,8,65,77,25,69};
	if(checkForNumberArePrentOrNot(arr1, arr))
	{
		System.out.println("all numbers are present");
		
	}
	else {
		System.out.println("all numbers are not present");
	}
}
static boolean checkForNumberArePrentOrNot(int [] arr ,int [] arr1)
{
	int num= arr1.length;
	int count=0;
	for(int i=0;i<arr1.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			if(arr1[i]==arr[j])
			{
				count++;
			}
		}
	}
	
	if(count==num)
	
		return true;
	
	else 
		return false;
}
}
