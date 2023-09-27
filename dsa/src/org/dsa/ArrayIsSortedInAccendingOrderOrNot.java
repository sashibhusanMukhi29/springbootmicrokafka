package org.dsa;

public class ArrayIsSortedInAccendingOrderOrNot {
	public static void main(String[] args) {
		int numArr[] = { 3, 2, 5, 6, 4, 8, 9, 7, 1, 0, 1, 25, 74, 0, 01, 0 };
	    if( checkForSortedArrayInAccendingOrNot(numArr))
	    {
	    	System.out.println(" sorted");
	    }
	    else {
	    	System.out.println(" not sorted");
	    }

	}

	static boolean checkForSortedArrayInAccendingOrNot(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

					count++;
				}
			}
		}
		
		if(count==0)
		{
			return true;
		}
		else {
			return false;
		}
		
	}
}
