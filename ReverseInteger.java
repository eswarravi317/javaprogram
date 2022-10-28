package leetcode;

import java.util.Scanner;

public class ReverseInteger {
	public int reverse(int x) {
		long result = 0;
		while(x != 0) {
			result = (result * 10) + (x%10);
			if(result > Integer.MAX_VALUE) return 0;
            if(result < Integer.MIN_VALUE) return 0;
			x = x/10;
		}
        return (int)result;
    }
	public static void main(String[] args) {
		ReverseInteger obj = new ReverseInteger();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		sc.close();
		System.out.println(obj.reverse(num));
	}
}