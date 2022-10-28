package leetcode;

import java.util.Scanner;

public class Palindrome {
	public boolean isPalindrome(int x) {
		String str = String.valueOf(x);
		char[] num2 = str.toCharArray();
		String revnum = "";
		for(int i=num2.length-1; i>=0; i--) {
			revnum += num2[i];
		}
		if(str.equals(revnum)) {
			return true;
		}
		else {
			return false;
		}
    }
	public static void main(String[] args) {
		Palindrome obj = new Palindrome();
		Scanner sc = new Scanner(System.in);
		System.out.print("Number: ");
		int num1 = sc.nextInt();
		sc.close();
		if(obj.isPalindrome(num1)) {
			System.out.println(num1 +" is a Palindrome");
		}
		else {
			System.out.println(num1 +" is not a Palindrome");
		}
	}
}