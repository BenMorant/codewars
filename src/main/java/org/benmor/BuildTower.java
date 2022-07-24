package org.benmor;

import java.util.ArrayList;
import java.util.List;

public class BuildTower {

  public static String[] towerBuilder(int nFloors) {
    List<String> build = new ArrayList<>();
    for (int i = 1; i <= nFloors; i++) {
      String floor = " ".repeat(nFloors - i) + "*".repeat(2 * i - 1) + " ".repeat(nFloors - i);
      build.add(floor);
    }

    return build.toArray(new String[0]);
  }
}

// Better :
//
// public static String[] TowerBuilder(int n) {
//        String t[] = new String[n], e;
//
//        for (int i = 0; i < n; i++)
//        t[i] = (e = " ".repeat(n-i-1)) + "*".repeat(i+i+1) + e;
//
//        return t;
//        }
