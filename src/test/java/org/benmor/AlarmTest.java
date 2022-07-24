package org.benmor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AlarmTest {
  @Test
  public void setAlarmTest() {
    assertTrue(Alarm.setAlarm(true, false), "Should be true.");
    assertFalse(Alarm.setAlarm(true, true), "Should be false.");
    assertFalse(Alarm.setAlarm(false, false), "Should be false.");
    assertFalse(Alarm.setAlarm(false, true), "Should be false.");
  }
}
