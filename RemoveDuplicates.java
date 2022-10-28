package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
	public int removeDuplicates(int[] nums) {
		int k = 0, count = 0;
		int resarr[] = new int[nums.length];
		Arrays.sort(nums);
		for(int i=0; i<nums.length; i++) {
			int item = nums[i];
			for(int j=0; j<nums.length; j++) {
				if(item == nums[j]) {
					count++;
				}
			}
			if(count==1) {
				resarr[k] = item;
				k++;
				count = 0;
			}
			else {
				boolean present = false;
				for(int j=0; j<resarr.length; j++) {
					if(nums[i]==resarr[j]) {
						present = true;
						break;
					}
					else {
						present = false;
					}
				}
				if(!present) {
					resarr[k] = item;
					k++;
				}
			}
		}
		System.out.println("Array after remove duplicates: "+Arrays.toString(resarr));
		return k;
    }
	public static void main(String[] args) {
		RemoveDuplicates obj = new RemoveDuplicates();
		Scanner sc = new Scanner(System.in);
		System.out.print("Array size: ");
		int SIZE = sc.nextInt();
		int arr[] = new int[SIZE];
		System.out.println("Input elements");
		for(int i=0; i<SIZE; i++) {
			System.out.print("Index "+i+": ");
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Original Array: "+Arrays.toString(arr));
		System.out.println("No of new array elements: "+obj.removeDuplicates(arr));
	}
}