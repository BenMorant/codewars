package org.benmor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SheepTest {
  @Test
  public void testSheep() {
    assertEquals("", Sheep.countingSheep(0));
    assertEquals("1 sheep...", Sheep.countingSheep(1));
    assertEquals("1 sheep...2 sheep...", Sheep.countingSheep(2));
    assertEquals("1 sheep...2 sheep...3 sheep...", Sheep.countingSheep(3));
  }
}
