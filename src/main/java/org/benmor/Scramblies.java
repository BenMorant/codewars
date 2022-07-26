package org.benmor;

import java.util.HashMap;

public class Scramblies {

  public static boolean scramble(String str1, String str2) {
    HashMap<Character, Integer> map = new HashMap<>();
    for (char ch : str1.toCharArray()) map.put(ch, 1 + map.getOrDefault(ch, 0));
    for (char ch : str2.toCharArray()) {
      Integer count = map.getOrDefault(ch, 0);
      if (count == 0) return false;
      map.put(ch, --count);
    }
    return true;
  }

  //    public static boolean scramble(String str1, String str2) {
  //              if (str2.length() > str1.length()) return false;
  //        for (String s: str2.split("")) {
  //        if (!str1.contains(s))  return false;
  //        str1 = str1.replaceFirst(s,"");
  //    }
  //
  //        return true;
  // }
  //
  //    public static boolean scramble(String str1, String str2) {
  //        LinkedList<Character> linkedList = new LinkedList<Character>();
  //        for(char a: str1.toCharArray()){
  //            linkedList.add(a);
  //        }
  //        for(char a: str2.toCharArray()) {
  //            if(!linkedList.remove((Character)a)) {
  //                return false;
  //            }
  //        }
  //        return true;
  //    }
}
