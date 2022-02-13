package Recursion;

import java.util.Scanner;

public class TowersOfHanoi {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    move(n, 'A', 'C', 'B');
  }

  public static void move(int totalDiscs, char from, char to, char inter) {
    if(totalDiscs == 1) {
      System.out.println("Move 1 from: "+ from + " to: " + to);
    } else {
      move(totalDiscs - 1, from, inter, to);
      System.out.println("Move disc: " + totalDiscs + " from: " + from + " to: " + to);
      move(totalDiscs - 1, inter, to, from);
    }
  }
}
