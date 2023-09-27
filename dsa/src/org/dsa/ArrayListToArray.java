package org.dsa;

import java.util.ArrayList;

public class ArrayListToArray {
	public static void main(String[] args) {
		ArrayList<Integer>arList= new ArrayList<>();
		arList.add(1);
		arList.add(12);
		arList.add(13);
		arList.add(14);

		for(Integer data: convertArraysIntoArrayList(arList))
		{
			System.out.println(data);
		}
	}
	static Integer[] convertArraysIntoArrayList(ArrayList<Integer>arrList)
	{
		Integer[] arr= new Integer[arrList.size()];
		arrList.toArray(arr);
		return arr;
		
	}

}
