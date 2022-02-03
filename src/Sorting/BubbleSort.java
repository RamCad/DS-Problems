package Sorting;

import Util.CommonUtility;

public class BubbleSort {

  public static void main(String[] args) {
    int[] input = CommonUtility.scanArrInput();
    CommonUtility.printArr(input);
    bubbleSort(input);
    CommonUtility.printArr(input);
  }

  public static void sort(int[] unordered){
    for(int i = 0; i < unordered.length; i++){
      for(int j = i+1; j < unordered.length; j++) {
        if(unordered[i] > unordered[j]) {
          int temp = unordered[j];
          unordered[j] = unordered[i];
          unordered[i] = temp;
        }
      }
    }
  }

  public static void bubbleSort(int[] unordered) {
    for(int i = 1; i < unordered.length; i++) {
      for (int j = 0; j < unordered.length - i; j++) {
        if(unordered[j] > unordered[j+1]) {
          int temp = unordered[j];
          unordered[j] = unordered[j+1];
          unordered[j+1] = temp;
        }
      }
    }
  }
}
