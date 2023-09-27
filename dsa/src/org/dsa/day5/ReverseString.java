package org.dsa.day5;

public class ReverseString {
public static void main(String[] args) {
	String [] arr= {"sashi","bhusan","mukhi"};
	for(String data:reverseString(arr))
	{
		System.out.println(data);
	}
}
static String [] reverseString(String [] arr)
{
	String[] arr2= new String[arr.length];
	int count =0;
	for(int i=arr.length-1;i>=0;i--)
	{
		arr2[count++]=arr[i];
	}
	return arr2;
}
}
