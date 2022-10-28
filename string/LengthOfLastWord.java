package leetcode;

import java.util.Scanner;

public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {
		String[] str = s.split(" ");
		return str[str.length-1].length();
    }
	public static void main(String[] args) {
		LengthOfLastWord obj = new LengthOfLastWord();
		Scanner sc = new Scanner(System.in);
		System.out.print("String: ");
		String str = sc.nextLine();
		sc.close();
		System.out.println(obj.lengthOfLastWord(str));
	}
}