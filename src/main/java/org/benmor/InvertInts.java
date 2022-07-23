package org.benmor;

import java.util.Arrays;

public class InvertInts {
  public static int[] invert(int[] array) {
    System.out.println();
    return Arrays.stream(array).map(number -> -number).toArray();
  }
}
