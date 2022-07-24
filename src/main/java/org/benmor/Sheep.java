package org.benmor;

public class Sheep {

  public static String countingSheep(int num) {
      String result = "";
      for (int i = 1; i <= num; i++){
          result += i + " sheep...";
      }
    return result;
  }

// solution with stringbuilder :
//    public static String countingSheep(int num) {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 1; i <= num; i++) {
//            stringBuilder.append(i).append(" sheep...");
//        }
//        return stringBuilder.toString();
//    }
    
}
