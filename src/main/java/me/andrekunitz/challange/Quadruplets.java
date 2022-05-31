package me.andrekunitz.challange;

import java.util.ArrayList;
import java.util.List;

public class Quadruplets {

	public static List<Integer[]> findFourNumberSum(int[] array, int targetSum) {
		var result = new ArrayList<Integer[]>();

		for (int firstPointer = 0; firstPointer < array.length; firstPointer++) {
			for (int secondPointer = firstPointer + 1; secondPointer < array.length; secondPointer++) {
				for (int thirdPointer = secondPointer + 1; thirdPointer < array.length; thirdPointer++) {
					for (int fourthPointer = thirdPointer + 1; fourthPointer < array.length; fourthPointer++) {

						var sum = array[firstPointer] + array[secondPointer] + array[thirdPointer] + array[fourthPointer];
						if (sum == targetSum) {
							Integer[] quadruplet = {array[firstPointer], array[secondPointer], array[thirdPointer], array[fourthPointer]};
							result.add(quadruplet);
						}
					}
				}
			}
		}

		return result;
	}
}
