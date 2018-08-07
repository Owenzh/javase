package train_002;

public class Code_01_sort {

	public static void originalSort(int[] arr, boolean asc) {
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				if (asc) {
					if (arr[i] > arr[j]) {
						int tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				} else {
					if (arr[i] < arr[j]) {
						int tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
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
						int tmp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = tmp;
					}
				} else {
					if (arr[j] < arr[j + 1]) {
						int tmp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = tmp;
					}
				}

			}
		}
		Code_01_sort.printArray(arr);
	}

	public static int[] quickSort(int[] arr, boolean asc) {
		Code_01_sort.printArray(arr);
		return arr;
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
		Code_01_sort.originalSort(a, true);
		Code_01_sort.originalSort(a, false);
		Code_01_sort.bubbleSort(b, true);
		Code_01_sort.bubbleSort(b, false);

	}

}
