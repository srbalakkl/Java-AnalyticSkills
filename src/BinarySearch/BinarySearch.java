package BinarySearch;

public class BinarySearch {

    public int iterativeSearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + end;
            /*
            @param start and @param end values will change dynamically based on @param mid
            So @param mid must be put inside the while loop
             */

            if (key < arr[mid]) {
                end = mid - 1;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                if (key == arr[mid]) {
                    return mid;
                }
            }
        }
        return -1;
    }

    public int recursiveSearch(int[] arr, int key, int start, int end) {

        if (start > end){
            return -1;
        }

        int mid = (start + end)/2;

        if (key < arr[mid]) {
            return recursiveSearch(arr, key, start, mid - 1);
        } else if (key > arr[mid]) {
            return recursiveSearch(arr, key, mid + 1, end);
        }else if (key == arr[mid]) {
            return mid;
        }

        return -1;
    }

    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        System.out.println("Array value is found at the location " + obj.iterativeSearch(arr, 2));
        System.out.println("Array value is found at the location " + obj.recursiveSearch(arr,8,0,arr.length-1));
    }
}
