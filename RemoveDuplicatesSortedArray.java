package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesSortedArray {
	public int[] removeDuplicate(int[] arr) {
		int[] resarr = new int[arr.length];
		Arrays.sort(arr);
		int k=0, item = 0, c = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				item = arr[i];
				for(int j=0; j<arr.length; j++) {
					if(item==0) {
						continue;
					}
					else if(item == arr[j]) {
						c++;
						arr[j] = 0;
					}
				}
				if(c>0) {
					resarr[k] = item;
					k++;
				}
			}
			else {
				continue;
			}
		}
		return resarr;
	}
	public static void main(String[] args) {
		RemoveDuplicatesSortedArray obj = new RemoveDuplicatesSortedArray();
		Scanner sc = new Scanner(System.in);
		System.out.print("Array size: ");
		int SIZE = sc.nextInt();
		int[] arr = new int[SIZE];
		System.out.println("Input Array");
		for(int i=0; i<SIZE; i++) {
			System.out.print("Index "+i+": ");
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(Arrays.toString(obj.removeDuplicate(arr)));
	}
}