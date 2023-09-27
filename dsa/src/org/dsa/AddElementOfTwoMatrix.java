package org.dsa;

public class AddElementOfTwoMatrix {
	public static void main(String[] args) {
		int [][] arr= {{1,2,3},{1,2,3}};
		int [][] arr1= {{1,2,3},{1,0,3}};
		System.out.println(sumOfTwoMatrix(arr1, arr1));
	}
	
	static int sumOfTwoMatrix(int [][] arr1,int[][]arr2)
	{
		int [][]sum=new int[arr1.length][arr1.length];
		int total=0;
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1.length;j++)
			{
				total=total+arr1[i][j]+arr2[i][j];
				System.out.println(total);
			}
		}
		return total;
	}

}
