package Algos.LinkedList;

public class SortSentence {

  public static void main(String[] args) {

    System.out.println(sortSentence("is2 sentence4 This1 a3"));
  }

  public static String sortSentence(String s) {

    String[] existing = s.split(" ");

    String[] newArr = new String[existing.length];

    for (String p : existing) {
      newArr[Character.getNumericValue(p.charAt(p.length() - 1))-1] = p.substring(0, p.length() - 1);
    }

    return String.join(" ", newArr);
  }
}
