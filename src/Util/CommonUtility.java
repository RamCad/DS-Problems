package Util;

import java.util.Scanner;

public class CommonUtility {

  public static int[] scanArrInput() {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] input = new int[n];
    for(int i = 0; i < n; i++){
      input[i] = scan.nextInt();
    }
    return input;
  }

  public static void printArr(int[] arr) {
    for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
