package PracticeProblems;

public class Anagram {

  public static void main(String[] args) {
    String str1 = "ate";
    String str2 = "eat";

    System.out.println(checkAnagram(str1, str2));
  }

  public static boolean checkAnagram(String str1, String str2) {
    if (str1.length() != str2.length()) {
      return false;
    }
    int[] charSet = new int[128];
    int uniqueChars1 = 0;
    int uniqueChars2 = 0;
    for(char c: str1.toCharArray()) {
      if(charSet[c] == 0) {
        ++uniqueChars1;
      }
      charSet[c]++;
    }
    for(int i = 0; i < str2.length(); i++) {
      char c = str2.charAt(i);
      if(charSet[c] == 0) {
        return false;
      }
      --charSet[c];
      if(charSet[c] == 0) {
        ++uniqueChars2;
        if(uniqueChars1 == uniqueChars2) {
          return i == str2.length() - 1;
        }
      }
    }
    return false;
  }
}
