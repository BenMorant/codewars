package org.benmor;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvertIntsTest {

  @Test
  public void testInvert() {

    int[] input = new int[] {-1, -2, -3, -4, -5};
    int[] expected = new int[] {1, 2, 3, 4, 5};
    assertEquals(Arrays.toString(expected), Arrays.toString(InvertInts.invert(input)));

    input = new int[] {-1, 2, -3, 4, -5};
    expected = new int[] {1, -2, 3, -4, 5};
    assertEquals(Arrays.toString(expected), Arrays.toString(InvertInts.invert(input)));

    input = new int[] {};
    expected = new int[] {};
    assertEquals(Arrays.toString(expected), Arrays.toString(InvertInts.invert(input)));

    input = new int[] {0};
    expected = new int[] {0};
    assertEquals(Arrays.toString(expected), Arrays.toString(InvertInts.invert(input)));
  }
}
