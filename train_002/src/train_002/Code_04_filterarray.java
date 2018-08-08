package train_002;

public class Code_04_filterarray {

	public static int[] filterZeroArray(int[] arr) {
		int zc = Code_04_filterarray.getZeroCount(arr);
		int[] new_arr = new int[arr.length - zc];
		int k = 0;
		for (int e : arr) {
			if (e != 0) {
				new_arr[k++] = e;
			}
		}
		return new_arr;
	}

	public static int getZeroCount(int[] arr) {
		int zero_count = 0;
		for (int e : arr) {
			if (e == 0) {
				zero_count++;
			}
		}
		return zero_count;
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
		int a[] = { 1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 0, 7, 6, 7, 0, 5 };
		int b[] = null;
		b = Code_04_filterarray.filterZeroArray(a);
		Code_04_filterarray.printArray(a);
		Code_04_filterarray.printArray(b);
	}

}
