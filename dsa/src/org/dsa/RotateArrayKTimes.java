package org.dsa;

import java.util.Scanner;

public class RotateArrayKTimes {
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the length of the array: ");
	        int length = scanner.nextInt();
	        int[] arr = new int[length];
	        
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < length; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        
	        System.out.print("Enter the number of steps to rotate: ");
	        int steps = scanner.nextInt();
	        
	        rotateArray(arr, steps);
	        
	        System.out.println("Rotated array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        
	        scanner.close();
	}

	public static void rotateArray(int[] nums, int k) {
		int n = nums.length;
		k = k % n; // To handle cases where k is larger than array length

		reverse(nums, 0, n - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, n - 1);
	}

	public static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
}
