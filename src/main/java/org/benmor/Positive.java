package org.benmor;

import java.util.Arrays;

public class Positive {
  public static int sum(int[] arr) {
    return Arrays.stream(arr).filter(number -> number >= 0).sum();
  }
}
