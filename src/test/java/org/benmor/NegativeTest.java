package org.benmor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NegativeTest {
  @Test
  public void test1() {
    assertEquals(-42, Negative.makeNegative(42));
  }
}
