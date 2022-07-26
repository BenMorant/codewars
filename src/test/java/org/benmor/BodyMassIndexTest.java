package org.benmor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BodyMassIndexTest {

  @Test
  public void testBMI() {
    assertEquals("Normal", BodyMassIndex.calculateBmi(80, 1.80));
    assertEquals("Underweight", BodyMassIndex.calculateBmi(50, 1.80));
    assertEquals("Overweight", BodyMassIndex.calculateBmi(90, 1.80));
    assertEquals("Obese", BodyMassIndex.calculateBmi(180, 1.80));
  }
}
