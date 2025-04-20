package com.corejava.practice;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 3, 2, 2, 3, 4, 5 };
		int val = 2;
		int j = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[j] = nums[i];
				j++;
			}
		}

		System.out.println("length : " + j + " " + Arrays.toString(nums));
	}

}
