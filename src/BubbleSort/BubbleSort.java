package BubbleSort;

public class BubbleSort {
    public void sort(int[] arr) {
        System.out.println("arr.length = " + arr.length);
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }

            if (!isSwapped) {
                break;
            }
        }
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 9, 10, 3};
        BubbleSort obj = new BubbleSort();
        obj.printArray(arr);
        obj.sort(arr);
        obj.printArray(arr);
    }
}
