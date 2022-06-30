import java.util.Arrays;

class SelectionSort {
    public static void main(final String[] args) {
        final int[] arr = { 4, 10, 8, 7, 12, 24, 57, -6, -90, -20, 0, 1 };
        System.out.println(Arrays.toString(selectionSort(arr)));

    }

    private static int[] selectionSort(final int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[index] > arr[j]) {
                    index = j;
                }
            }
            final int temp;
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        return arr;
    }
}
