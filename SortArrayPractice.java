package day11.homework;

import java.util.Arrays;

public class SortArrayPractice {

	public static void main(String[] args) {
		int arrayToCheck[] = { 1, 2, 2, 0, 0, 1, 2, 2, 1 };
		sortArray(arrayToCheck);
	}

	public static void sortArray(int[] array) {
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i < array.length; i++) {
			switch (array[i]) {
			case 0:
				count0++;
				break;
			case 1:
				count1++;
				break;
			case 2:
				count2++;
				break;
			}

		}

		int i = 0;
		while (count0 > 0) {
			array[i++] = 0;
			count0--;
		}
		while (count1 > 0) {
			array[i++] = 1;
			count1--;
		}
		while (count2 > 0) {
			array[i++] = 2;
			count2--;
		}

		System.out.println(Arrays.toString(array));
	}

}

// Time complexity: O(n)
