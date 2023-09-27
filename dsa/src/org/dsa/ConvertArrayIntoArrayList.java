package org.dsa;

import java.util.ArrayList;
import java.util.Collections;

public class ConvertArrayIntoArrayList {
public static void main(String[] args) {
	Integer[] arr = { 1, 2, 5, 4, 8, 2, 8 };
	System.out.println(converArrayIntoArrayList(arr).toString());
}
static ArrayList<Integer>converArrayIntoArrayList(Integer [] arr)
{
	ArrayList<Integer>arrList= new ArrayList<>();
	Collections.addAll(arrList, arr);
	return arrList;
}
}
