package Sorting;

import Util.CommonUtility;

public class InsertionSort {

  public static void main(String[] args) {
    int[] input = CommonUtility.scanArrInput();

    CommonUtility.printArr(input);
    insertionSort(input);
    CommonUtility.printArr(input);
  }

  public static void insertionSort(int[] arr) {
    for(int i = 0; i < arr.length; i++) {
      int current = arr[i];
      int j = i - 1;
      while(j >= 0 && arr[j] > current) {
        arr[j+1] = arr[j];
        j--;
      }
      arr[j+1] = current;
    }
  }
}
