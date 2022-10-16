package org.benmor;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    return Stream.of(name.split(" "))
        .map(subName -> String.valueOf(Character.toUpperCase(subName.charAt(0))))
        .collect(Collectors.joining("."));
  }

//  public static String abbrevName(String name) {
//    String[] names = name.split(" ");
//    return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
//  }
//
//  public static String abbrevName(String name) {
//    return name.toUpperCase().replaceAll("(.).*\\s(.).*", "$1.$2");
//  }
}
