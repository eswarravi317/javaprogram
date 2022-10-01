package string;

import java.util.Scanner;

public class Occurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		sc.close();
		int count = 0;
		char ocstr = 0;
		char[] strchar = str.toCharArray();
		for(int i=0; i<strchar.length; i++) {
			char tempchar = strchar[i];
			int temp = 1;
			for(int j=i+1; j<strchar.length; j++) {
				if(strchar[i] == strchar[j]) {
					temp++;
				}
			}
			if(count<temp) {
				count = temp;
				ocstr = tempchar;
			}
		}
		if(count>1) {
			System.out.println("The maximum occurance character is "+ocstr+", count is "+count);
		}
		else {
			System.out.println("All the characters in equal occurence");
		}
	}
}