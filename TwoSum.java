package leetcode;

import java.util.*;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		int k=0;
		boolean present = false;
		for(int i=0; i<nums.length; i++) {
			int item = nums[i];
			for(int j=0; j<nums.length; j++) {
				if(i == j) {
					continue;
				}
				else {
					if((item + nums[j]) == target) {
						result[k] = i;
						k++;
						result[k] = j;
						present = true;
						break;
					}
				}
			}
			if(present) {
				break;
			}
		}
		return result;
    }
	public static void main(String[] args) {
		TwoSum obj = new TwoSum();
		Scanner sc = new Scanner(System.in);
		System.out.print("Array size: ");
		int SIZE = sc.nextInt();
		int arr[] = new int[SIZE];
		for(int i=0; i<arr.length; i++) {
			System.out.print("Index "+i+": ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Target: ");
		int target = sc.nextInt();
		sc.close();
		System.out.println(Arrays.toString(obj.twoSum(arr, target)));
	}
}