package org.dsa;

public class Arrange0And1 {
public static void main(String[] args) {
	int [] arr= {0,1,0,1,0,1,0};
	for(Integer data:arrange0and1(arr))
	{
		System.out.println(data);
	}
}
static int [] arrange0and1(int [] arr )
{
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++) {
			if(arr[i]<arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
	}
	return arr;
	
}
}
