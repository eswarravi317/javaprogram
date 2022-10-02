package string;

import java.util.Arrays;
import java.util.Scanner;

// Method - 1

public class RemoveDuplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		char[] str1 = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<str1.length; i++) {
			boolean repeated = false;
			for(int j=i+1; j<str1.length; j++) {
				if(str1[i] == str1[j]) {
					repeated = true;
					break;
				}
			}
			if(!repeated) {
				sb.append(str1[i]);
			}
		}
		System.out.println(sb);
	}
}

// Method - 2

public class RemoveDuplicate {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string: ");
	String str = sc.nextLine();
	StringBuffer sb = new StringBuffer();
	for(int i=0; i<str.length(); i++) {
		boolean repeated = false;
		for(int j=i+1; j<str.length(); j++) {
			if(str.charAt(i) == str.charAt(j)) {
				repeated = true;
				break;
			}
		}
		if(!repeated) {
			sb.append(str.charAt(i));
		}
	}
	System.out.println(sb);
}
}