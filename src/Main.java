public class Main {

    public static Boolean linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static Boolean binarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;

        while (low < high) {
            if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] == target) {
                return true;
            }
            mid = (low + high) / 2;
        }
        return false;
    }

    public static int twoCrystalBreak(Boolean[] arr) {
        int jumpAmnt = (int) Math.floor(Math.sqrt(arr.length));
        System.out.println(jumpAmnt);

        int i = jumpAmnt;

        for (; i < arr.length; i += jumpAmnt) {
            if (arr[i]) {
                break;
            }
            System.out.println(i);
        }
        i -= jumpAmnt;
        for (int j = 0; j <= jumpAmnt; ++j, ++i) {
            if (arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (arr.length - 1 - i); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

//        Boolean result = linearSearch(new int[]{1, 2, 3, 4, 5}, 3);
//        System.out.println("Linear search - The target is on array ? " + result);
//
//        Boolean resultBinary = binarySearch(new int[]{1, 2, 3, 4, 5}, 3);
//        System.out.println("Binary search - The target is on array ? " + resultBinary);

//        int resultCrystal = twoCrystalBreak(new Boolean[]{false, false, false, false, false, false, false, false, false, true, false, false, false, false, false});
//        System.out.println("Crystal search - The target is on array ? " + resultCrystal);


        int[] unorderedArr = new int[]{5, 4, 3, 2, 1};
        bubbleSort(unorderedArr);

        for (int i = 0; i < unorderedArr.length; i++) {
            System.out.println(unorderedArr[i]);
        }

    }
}