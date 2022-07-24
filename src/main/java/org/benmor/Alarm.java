package org.benmor;

public class Alarm {

  public static boolean setAlarm(boolean employed, boolean vacation) {
    return employed && !vacation;
  }
}
