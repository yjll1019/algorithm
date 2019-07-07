package algorithm;

import java.util.Scanner;

/*
	작성일 : 06월 04일
	내 용 : 수 정렬하기 - 힙 정렬을 이용해 오름차순으로 수 정렬하기

 */
public class Code_2751 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		int[] a = new int[num];

		for (int i = 0; i < num; ++i) {
			a[i] = scanner.nextInt();
		}

		mergeSort(a, 0, a.length - 1);
		for (int i : a) {
			System.out.println(i);
		}
	}

	private static void mergeSort(int[] a, int start, int end) {
		if (start < end) {
			int middle = (end + start) / 2;
			mergeSort(a, start, middle);
			mergeSort(a, middle + 1, end);
			merge(a, start, middle, end);
		}
	}

	private static void merge(int[] a, int start, int middle, int end) {
		int length = end - start + 1;
		int[] temp = new int[length];
		int i = 0;
		int index1 = start;
		int index2 = middle + 1;

		while (index1 <= middle && index2 <= end) {
			if (a[index1] < a[index2]) {
				temp[i++] = a[index1++];
			} else {
				temp[i++] = a[index2++];
			}
		}

		while (index1 <= middle) {
			temp[i++] = a[index1++];
		}
		while (index2 <= end) {
			temp[i++] = a[index2++];
		}
		for (i = 0; i < temp.length; ++i) {
			a[start + i] = temp[i];
		}
	}
}
