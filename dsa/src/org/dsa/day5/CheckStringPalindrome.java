package org.dsa.day5;
public class CheckStringPalindrome {
	public static void main(String[] args) {
		
		String data="mmmammm";
		System.out.println(checkForStringPalindrome(data));

	}

	static Boolean checkForStringPalindrome(String data) {
		char[] arr1 = data.toCharArray();
		String palindrome = "";
		for (int i = arr1.length - 1; i >= 0; i--) {
			palindrome = palindrome + arr1[i];

		}
	
		if (data.equalsIgnoreCase(palindrome)) {
			
			return true;
		} else
			return false;

	}
}
