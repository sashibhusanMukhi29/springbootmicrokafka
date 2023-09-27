package org.dsa;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateEemetentsInAArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 4, 8, 2, 8 };
		for (int data : findDuplicateElementInAArray(arr)) {
			System.out.println(data);
		}
	}

	static int[] findDuplicateElementInAArray(int[] arr) {
		Set<Integer> duplicate = new LinkedHashSet<>();

		int[] arr2 = null;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] != arr[j]) {
					duplicate.add(arr[i]);
				}

			}
		}
		arr2 = new int[duplicate.size()];
		int count=0;
		for(int data : duplicate)
		{
			arr2[count++]=data;
		}
		
		return arr2;

	}

}
