package org.benmor;

import java.util.ArrayList;
import java.util.List;

public class Sequence {
  public static int[] reverse(int n) {
    List<Integer> result = new ArrayList<>();
    for (int i = n; i > 0; i--) {
      result.add(i);
    }
    return result.stream().mapToInt(i -> i).toArray();
  }
}

// more elegant solution :
// import java.util.stream.IntStream;
//
// public class Sequence{
//
//  public static int[] reverse(int n){
//
//    return IntStream.range(-n, 0).map(Math::abs).toArray();
//  }
//
// }
