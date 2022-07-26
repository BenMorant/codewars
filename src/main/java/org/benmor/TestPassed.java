package org.benmor;

public class TestPassed {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    int total = 0;
    for (int classPoint : classPoints) {
      total += classPoint;
    }
    int average = (total + yourPoints) / (classPoints.length + 1);
    return yourPoints > average;

    // better (or weird ?)  :         return Arrays.stream(classPoints).average().orElse(0) <
    // yourPoints;
  }
}
