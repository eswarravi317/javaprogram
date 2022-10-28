package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArrays {
	public static void main(String[] args) {
		MergeTwoSortedArrays obj = new MergeTwoSortedArrays();
		Scanner sc = new Scanner(System.in);
		System.out.print("Array size: ");
		int SIZE = sc.nextInt();
		int[] arr1 = new int[SIZE];
		int[] arr2 = new int[SIZE];
		int[] resarr = new int[SIZE*2];
		System.out.println("Array 1");
		for(int i=0; i<SIZE; i++) {
			System.out.print("Index "+i+": ");
			arr1[i] = sc.nextInt();
		}
		System.out.println("Array 2");
		for(int i=0; i<SIZE; i++) {
			System.out.print("Index "+i+": ");
			arr2[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int j=0, k=0;
		for(int i=0; i<SIZE*2; i+=2) {
			resarr[i] = arr1[j++];
		}
		for(int i=1; i<SIZE*2; i+=2) {
			resarr[i] = arr2[k++];
		}
		System.out.println("Result: "+ Arrays.toString(resarr));
	}
}