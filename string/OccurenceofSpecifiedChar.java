package string;

import java.util.Scanner;

public class OccurenceofSpecifiedChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		System.out.print("Enter a char: ");
		char c = sc.next().charAt(0);
		sc.close();
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == c) {
				count++;
			}
		}
		System.out.println("The occurence of "+c+" is, "+count);
	}
}