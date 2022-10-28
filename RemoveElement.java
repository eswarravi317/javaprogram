package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
	public void removeElement(int[] nums, int val) {
		int count = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == val) {
				count++;
			}
		}
		int[] resarr = new int[count];
		int j=0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] != val) {
				resarr[j] = nums[i];
				j++;
			}
		}
		System.out.println("Output: "+count+", "+ Arrays.toString(resarr));
	}
	public static void main(String[] args) {
		RemoveElement obj = new RemoveElement();
		Scanner sc = new Scanner(System.in);
		System.out.print("Array size: ");
		int SIZE = sc.nextInt();
		int[] arr = new int[SIZE];
		System.out.println("Input Array: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print("Index "+i+": ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Array :"+Arrays.toString(arr));
		System.out.print("Enter value: ");
		int val = sc.nextInt();
		sc.close();
		obj.removeElement(arr, val);
	}
}