package org.benmor;

public class Banjo {
  public static String areYouPlayingBanjo(String name) {
    return name.startsWith("R") || name.startsWith("r")
        ? name + " plays banjo"
        : name + " does not play banjo";
  }
}
