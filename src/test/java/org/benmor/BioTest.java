package org.benmor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BioTest {
  @Test
  public void testDna() {
    Bio b = new Bio();
    assertEquals("UUUU", b.dnaToRna("TTTT"));
  }

  @Test
  public void testDna2() {
    Bio b = new Bio();
    assertEquals("GCAU", b.dnaToRna("GCAT"));
  }
}
