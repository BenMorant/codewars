package org.benmor;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DnaStrand {
  public static String makeComplement(String dna) {

    return Stream.of(dna.split(""))
        .map(
            letter -> {
              if (letter.equals("T")) {
                return letter.replace("T", "A");
              }
              if (letter.equals("C")) {
                return letter.replace("C", "G");
              }
              if (letter.equals("A")) {
                return letter.replace("A", "T");
              }
              if (letter.equals("G")) {
                return letter.replace("G", "C");
              }
              return letter;
            })
        .collect(Collectors.joining(""));
  }

//  public static String makeComplement(String dna) {
//    char[] chars = dna.toCharArray();
//    for (int i = 0; i < chars.length; i++) {
//      chars[i] = getComplement(chars[i]);
//    }
//
//    return new String(chars);
//  }
//
//  private static char getComplement(char c) {
//    switch (c) {
//      case 'A':
//        return 'T';
//      case 'T':
//        return 'A';
//      case 'C':
//        return 'G';
//      case 'G':
//        return 'C';
//    }
//    return c;
//  }
//
//  public static String makeComplement(String dna) {
//    dna = dna.replaceAll("A", "Z");
//    dna = dna.replaceAll("T", "A");
//    dna = dna.replaceAll("Z", "T");
//    dna = dna.replaceAll("C", "Z");
//    dna = dna.replaceAll("G", "C");
//    dna = dna.replaceAll("Z", "G");
//    return dna;
//  }
}
