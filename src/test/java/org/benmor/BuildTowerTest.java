package org.benmor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BuildTowerTest {
  @Test
  public void basicTests() {
    assertEquals(String.join(",", "*"), String.join(",", BuildTower.towerBuilder(1)));
    assertEquals(String.join(",", " * ", "***"), String.join(",", BuildTower.towerBuilder(2)));
    assertEquals(
        String.join(",", "  *  ", " *** ", "*****"), String.join(",", BuildTower.towerBuilder(3)));
  }
}
