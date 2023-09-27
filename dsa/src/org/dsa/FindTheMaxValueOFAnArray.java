package org.dsa;

public class FindTheMaxValueOFAnArray {
	
	public static void main(String[] args) {
		int numArr[]={3,2,5,6,4,8,9,7,1,0,1,25,74,0,01,0};
		int maxValueFromAnArray = getMaxValueFromAnArray(numArr);
	
		System.out.println(maxValueFromAnArray + " is the largest number ");
		
	}
	
	static int getMaxValueFromAnArray(int[]numArr)
	{
		int max= numArr[0];
		
		for(int i=1;i<numArr.length;i++)
		{
			if(numArr[i]>max)
			{
				max=numArr[i];
				
				
			}
		}
		return max;
	}

}
