package train_002;

import java.util.Arrays;

public class Code_02_search {

	public static int search(int[] arr, int tar) {
		int len = arr.length, index = -1;
		for (int i = 0; i < len; i++) {
			if (arr[i] == tar) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static int searchOrderArray(int[] arr, int tar) {
		int len = arr.length, index = -1;
		int i = 0, j = len - 1, k;
		while (i <= j) {
			k = (i + j) / 2;
			if (tar == arr[k])
				return k;
			else if (tar < arr[k])
				j = k - 1;
			else
				i = k + 1;
		}

		return index;
	}

	public static void printArray(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			if (i == len - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ",");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 12, 3, 9, 17, 20, 1, 5, 6, 2, 40 };
		int[] b = { 1, 2, 3, 5, 6, 9, 12, 17, 20, 40 };
		Arrays.sort(b);
		Code_02_search.printArray(b);
		System.out.println("Find index: " + Code_02_search.searchOrderArray(b, 40));
		System.out.println("Find index: " + Code_02_search.searchOrderArray(b, 4));
		System.out.println("Find index: " + Code_02_search.searchOrderArray(b, 17));

		int target = 1;
		int p = Code_02_search.search(a, target);
		if (p != -1) {
			StringBuffer sbr = new StringBuffer();
			sbr.append("key is ");
			sbr.append(target);
			sbr.append(" , index is ");
			sbr.append(p + 1);
			System.out.println(sbr.toString());
		} else {
			System.out.println("Not found " + target);
		}
		System.out.println("End~");
	}

}
