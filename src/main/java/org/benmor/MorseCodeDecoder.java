package org.benmor;

import java.util.Arrays;
import java.util.stream.Collectors;


public class MorseCodeDecoder {
    public static String decode(String morseCode) {

        String[] morseWords = morseCode.trim().split("   ");

        String words =
                Arrays.stream(morseWords)
                        .map(
                                word -> {
                                    String[] morseLetters = word.split(" ");
                                    return Arrays.stream(morseLetters)
                                            .map(letter -> MorseCode.get(letter))
                                            .collect(Collectors.joining(""));
                                }).collect(Collectors.joining(" "));
        return words;
    }

//    public static String decode(String morseCode) {
//        return Arrays.stream(morseCode.trim().split("   "))
//                .map(MorseCodeDecoder::decodeWord)
//                .collect(Collectors.joining(" "));
//    }
//
//    private static String decodeWord(String word) {
//        return Arrays.stream(word.split(" ")).map(MorseCode::get).collect(Collectors.joining());
//    }

    private static class MorseCode {

        public static String get(String code) {
            return switch (code) {
                case ".-" -> "A";
                case "-..." -> "B";
                case "-.-." -> "C";
                case "-.." -> "D";
                case  "." -> "E";
                case "..-." -> "F";
                case  "--." -> "G";
                case  "...." -> "H";
                case  ".." -> "I";
                case  ".---" -> "J";
                case  "-.-" -> "K";
                case  ".-.." -> "L";
                case  "--" -> "M";
                case "-." -> "N";
                case  "---" -> "O";
                case  ".--." -> "P";
                case  "--.-" -> "Q";
                case  ".-." -> "R";
                case  "..." -> "S";
                case  "-" -> "T";
                case  "..-" -> "U";
                case  "...-" -> "V";
                case  ".--" -> "W";
                case  "-..-" -> "X";
                case  "-.--" -> "Y";
                case  "--.." ->  "Z";
                default -> "unknown";
            };

        }
    }
}
