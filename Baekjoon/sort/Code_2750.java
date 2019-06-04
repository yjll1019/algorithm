package algorithm;

import java.util.Arrays;
import java.util.Scanner;

/*
	작성일 : 06월 04일
	내 용 : 수 정렬하기 - 거품 정렬을 이용해 오름차순으로 수 정렬하기.

 */
public class Code_2750 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < num; ++i) {
			arr[i] = scanner.nextInt();
		}

		for (int i = arr.length - 1; i > 0; --i) {
			for (int j = 0; j < i; ++j) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j);
				}
			}
		}

		for (int i : arr) {
			System.out.println(arr);
		}
	}

	private static void swap(int[] arr, int j) {
		int temp = arr[j];
		arr[j] = arr[j + 1];
		arr[j + 1] = temp;

	}
}
