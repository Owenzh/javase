package train_002;

public class Code_01_sort {

	public static void selectSort(int[] arr, boolean asc) {
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				if (asc) {
					if (arr[i] > arr[j]) {
						// int tmp = arr[i];
						// arr[i] = arr[j];
						// arr[j] = tmp;
						arr[i] = arr[i] ^ arr[j];
						arr[j] = arr[i] ^ arr[j];
						arr[i] = arr[i] ^ arr[j];
					}
				} else {
					if (arr[i] < arr[j]) {
						// int tmp = arr[i];
						// arr[i] = arr[j];
						// arr[j] = tmp;
						arr[i] = arr[i] ^ arr[j];
						arr[j] = arr[i] ^ arr[j];
						arr[i] = arr[i] ^ arr[j];
					}
				}

			}
		}
		Code_01_sort.printArray(arr);
	}

	public static void bubbleSort(int[] arr, boolean asc) {
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - i - 1; j++) {
				if (asc) {
					if (arr[j] > arr[j + 1]) {
						// int tmp = arr[j];
						// arr[j] = arr[j + 1];
						// arr[j + 1] = tmp;
						arr[j + 1] = arr[j + 1] ^ arr[j];
						arr[j] = arr[j + 1] ^ arr[j];
						arr[j + 1] = arr[j + 1] ^ arr[j];
					}
				} else {
					if (arr[j] < arr[j + 1]) {
						// int tmp = arr[j];
						// arr[j] = arr[j + 1];
						// arr[j + 1] = tmp;
						arr[j + 1] = arr[j + 1] ^ arr[j];
						arr[j] = arr[j + 1] ^ arr[j];
						arr[j + 1] = arr[j + 1] ^ arr[j];
					}
				}

			}
		}
		Code_01_sort.printArray(arr);
	}

	public static void quickSort(int[] arr, boolean asc) {
		int len = arr.length;
		int base = arr[0];
		for (int i = 1; i < len; i++) {
			if (base < arr[i]) {

			} else {

			}
		}

		Code_01_sort.printArray(arr);
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
		int[] a = { 100, 40, 60, 87, 34, 11, 56, 0 };
		int[] b = { 100, 40, 60, 87, 34, 11, 56, 0 };
		Code_01_sort.selectSort(a, true);
		Code_01_sort.selectSort(a, false);
		Code_01_sort.bubbleSort(b, true);
		Code_01_sort.bubbleSort(b, false);

	}

}
