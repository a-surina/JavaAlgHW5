import java.util.Arrays;

public class SortManager {

    public SortManager() {
    }

    //Сортировка слиянием
    public int[] mergeSort(int[] arr) {
        int len = arr.length;
        if (len < 2) {
            return arr;
        }
        int middle = len / 2;
        return merge(mergeSort(Arrays.copyOfRange(arr, 0, middle)), mergeSort(Arrays.copyOfRange(arr, middle, len)));

    }

    public int[] merge(int[] arrA, int[] arrB) {
        int[] result = new int[arrA.length + arrB.length];
        int aInd = 0;
        int bInd = 0;

        for (int i = 0; i < result.length; i++) {
            result[i] = arrA[aInd] < arrB[bInd] ? arrA[aInd++] : arrB[bInd++];
            if (aInd == arrA.length) {
                System.arraycopy(arrB, bInd, result, ++i, arrB.length - bInd);
                break;
            }
            if (bInd == arrB.length) {
                System.arraycopy(arrA, aInd, result, ++i, arrA.length - aInd);
                break;
            }
        }
        return result;
    }

    //Сортировка пузырьком
    public int[] bubbleSort(int[] arr) {
        int numberOfShifts = 1;
        while (numberOfShifts != 0) {
            numberOfShifts = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    numberOfShifts += 1;
                    int buff = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buff;
                }
            }
        }
        return arr;
    }

    //Улучшенная сортировка пузырьком
    public int[] bubbleSortUpgraded(int[] arr) {
        int lastIndex = arr.length - 1;
        int firstIndex = 0;
        int numberOfShifts = 1;
        while (numberOfShifts != 0) {
            numberOfShifts = 0;
            for (int i = firstIndex; i < lastIndex; i++) {
                if (arr[i] > arr[i + 1]) {
                    numberOfShifts += 1;
                    int buff = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buff;
                }
            }
            lastIndex--;
            for (int i = lastIndex + 1; i > firstIndex; i--) {
                if (arr[i] < arr[i - 1]) {
                    numberOfShifts += 1;
                    int buff = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = buff;
                }
            }
            firstIndex++;
        }
        return arr;
    }

    //Сортировка методом выбора
    public int[] selectionSort(int[] arr) {
        int min;
        int index = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] <= min) {
                    min = arr[j];
                    index = j;
                }
            }
            int buff = arr[i];
            arr[i] = min;
            arr[index] = buff;
        }
        return arr;
    }

    //Сортировка методом вставки
    public int[] insertionSort(int[] arr) {
        int el;
        for (int i = 1; i < arr.length; i++) {
            el = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] > el) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = el;
        }
        return arr;
    }
}
