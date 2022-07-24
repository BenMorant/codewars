package org.benmor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UpperTest {
  Upper u = new Upper();

  @Test
  public void testUpper() {
    assertEquals("HELLO", Upper.MakeUpperCase("hello"));
  }
}
