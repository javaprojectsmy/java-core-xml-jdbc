package com.poonia.core;

/**
 * 
 * @author Alchemy Bubble sorting is also known as sinking sort compairing
 *         repeatedly by stepping through the list to be sorted if they are in
 *         the wrong order,array will pass through till no swap are needed
 */
public class TestBubbleSort {
	public int[] bubbleSort(int array[]) {
		int n = array.length;
		int k = 0;
		for (int m = n; m >= 0; m--) {

			for (int i = 0; i < n - 1; i++) {
				k = i + 1;
				if (array[i] > array[k])
					swapNumbers(i, k, array);
			}
		}
		return array;
	}

	private void swapNumbers(int i, int k, int array[]) {
		int temp;
		temp = array[i];
		array[i] = array[k];
		array[k] = temp;
	}

	public static void main(String[] args) {
		TestBubbleSort sorter = new TestBubbleSort();
		int sortedArray[] = sorter.bubbleSort(new int[] { 4, 100, 29, 56, 87,
				3, 58, 9 });
		for (int x : sortedArray) {
			System.out.println(x + ",");
		}
	}
}
