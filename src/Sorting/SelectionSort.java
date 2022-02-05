package Sorting;

import Util.CommonUtility;

public class SelectionSort {

  public static void main(String[] args) {
    int[] arr = CommonUtility.scanArrInput();
    CommonUtility.printArr(arr);
    selectionSort(arr);
    CommonUtility.printArr(arr);
  }

  public static void selectionSort(int[] arr) {
    for(int i = 0; i < arr.length; i++) {
      int min = i;
      for(int j = i+1; j < arr.length; j++) {
        if(arr[min] > arr[j]) {
          min = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
    }
  }

}
