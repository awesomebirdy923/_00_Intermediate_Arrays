package _00_Simple_Array_Algorithms;

public class _00_1D_Array_Methods {
	// 1. Complete the method so that it returns the sum of all
	// of the integers in the array being passed in
	static int sumIntArray(int[] values) {

		int sum = 0;

		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}

		return sum;
	}

	// 2. Complete the method so that it returns the average of all
	// of the integers in the array being passed in
	static double averageIntArray(int[] values) {

		int temp = 0;

		for (int i = 0; i < values.length; i++) {
			for (int j = 1; j < (values.length - i); j++) {
				if (values[j - 1] > values[j]) {
					// swap elements
					temp = values[j - 1];
					values[j - 1] = values[j];
					values[j] = temp;
				}

			}
		}

		double sum = 0;

		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum / values.length;

	}

	// 3. Complete the method so that it returns true if the integer
	// array contains the value specified by the second parameter.
	// It should otherwise return false.
	static boolean containsIntValue(int[] array, int value) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return true;
			}
		}

		return false;
	}

	// 4. Complete the method so that it returns the index of the,
	// first instance that the specified value occurs in the array.
	// If the array does not contain the specified value, it should return -1.
	static int getIndex(int[] arr, int value) {

		int index = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				index = i;
				break;
			}
		}

		return index;
	}
}
