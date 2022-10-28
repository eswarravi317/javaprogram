package leetcode;

import java.util.Scanner;

public class RomanToInt {
	public int romanToInt(String roman) {
		int result = 0, num = 0;
		for(int i=roman.length()-1; i>=0; i--) {
			switch(roman.charAt(i)) {
				case 'I':
	                num = 1;
	                break;
	            case 'V':
	                num = 5;
	                break;
	            case 'X':
	                num = 10;
	                break;
	            case 'L':
	                num = 50;
	                break;
	            case 'C':
	                num = 100;
	                break;
	            case 'D':
	                num = 500;
	                break;
	            case 'M':
	                num = 1000;
	                break;
			}
			if (4 * num < result) result -= num;
            else result += num;
		}
		return result;
	}
	
	public static void main(String[] args) {
		RomanToInt obj = new RomanToInt();
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Roman: ");
		String roman = sc.nextLine();
		sc.close();
		System.out.println("Output Int: "+ obj.romanToInt(roman));
	}	
}