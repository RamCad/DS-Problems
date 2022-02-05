package PracticeProblems;

public class DuplicateChars {

  public static void main(String[] args) {
    String str = "abc";
    System.out.println(hasDuplicateChars(str));
    str = "test";
    System.out.println(hasDuplicateChars(str));
    str = "noduplicates";
    System.out.println(hasDuplicateChars(str));
  }

  public static boolean hasDuplicateChars(String str) {
    for(int i = 0; i < str.length() - 1; i++) {
      if(str.substring(i+1).contains(Character.toString(str.charAt(i)))) {
       return true;
      }
    }
    return false;
  }

}
