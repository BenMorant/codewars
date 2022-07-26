package org.benmor;

public class BodyMassIndex {

  public static String calculateBmi(double weight, double height) {
    double bmi = weight / (height * height);
    return bmi <= 18.5
        ? "Underweight"
        : bmi <= 25.0 ? "Normal" : bmi <= 30.0 ? "Overweight" : "Obese";
  }
}
