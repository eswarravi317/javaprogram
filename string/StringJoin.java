package string;

import java.util.Scanner;

public class StringJoin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		sc.close();
		String[] strchar = str.split(" ");
		System.out.println(String.join("-", strchar));
	}
}