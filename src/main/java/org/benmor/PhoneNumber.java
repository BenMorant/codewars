package org.benmor;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PhoneNumber {
  public static String createPhoneNumber(int[] numbers) {
    String phoneNumber =
        Arrays.stream(numbers).mapToObj(String::valueOf).collect(Collectors.joining());
    return "("
        + phoneNumber.substring(0, 3)
        + ") "
        + phoneNumber.substring(3, 6)
        + "-"
        + phoneNumber.substring(6, 10);
  }
}

// better solutions :
// 1)     return String.format("(%d%d%d) %d%d%d-%d%d%d%d",
// java.util.stream.IntStream.of(numbers).boxed().toArray());
// 2)
// String phoneNumber = new String("(xxx) xxx-xxxx");
//
//    for (int i : numbers) {
//            phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
//            }
//
//            return phoneNumber;
