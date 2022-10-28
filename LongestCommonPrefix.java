package leetcode;

import java.util.*;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
            return "";
		Arrays.sort(strs);
		String firststr = strs[0];
        String laststr = strs[strs.length - 1];
        int count = 0;
        while(count < firststr.length())
        {
            if (firststr.charAt(count) == laststr.charAt(count))
                count++;
            else
                break;
        }
        return count == 0 ? "There is no common prefix" : firststr.substring(0, count);
    }
	public static void main(String[] args) {
		LongestCommonPrefix obj = new LongestCommonPrefix();
		Scanner sc = new Scanner(System.in);
		System.out.print("Array size: ");
		int SIZE = sc.nextInt();
		String inputarr[] = new String[SIZE];
		System.out.println("Enter Array Values");
		for(int i=0; i<SIZE; i++) {
			System.out.print("Index "+i+": ");
			inputarr[i] = sc.next();
		}
		sc.close();
		System.out.println(obj.longestCommonPrefix(inputarr));
	}
}