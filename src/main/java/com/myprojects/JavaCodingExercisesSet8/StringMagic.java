package com.myprojects.JavaCodingExercisesSet8;

import java.util.Arrays;
import java.util.Scanner;

public class StringMagic {

    public static boolean areAnagrams(String str1, String str2) {

        if (str1 == null || str2 == null ) {
            return false;
        }

        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();

        if (s1.length()!=s2.length()) {
            return false;
        }

        char[] charsForS1 = s1.toCharArray();
        char[] charsForS2 = s2.toCharArray();

        Arrays.sort(charsForS1);
        Arrays.sort(charsForS2);

        boolean anagramChecker = Arrays.equals(charsForS1,charsForS2);
        return anagramChecker;
    }

    public static String reverseWordsInSentence(String sentence) {
        if(sentence == null) {
            return "INVALID";
        }
        if(sentence.equals("")) {
            return "";
        }
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for(String word:words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedSentence.append(reversedWord).append(" ");
        }
        return reversedSentence.toString().trim();
    }

    private static void anagramCheckerWithInputFromUser(Scanner scanner) {
        System.out.println("Provide the two strings: ");
        System.out.println("Are the two strings provided anagram: " + areAnagrams(scanner.nextLine(),scanner.nextLine()));
    }

    private static void reverseWordsInSentenceWithInputFromUser(Scanner scanner) {
        System.out.println("Provide the sentence: ");
        System.out.println("The provided sentence reversed: " + reverseWordsInSentence(scanner.nextLine()));
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("cinema", "iceman"));
        System.out.println(reverseWordsInSentence("cinema is iceman"));

        Scanner scanner = new Scanner(System.in);
        anagramCheckerWithInputFromUser(scanner);
        reverseWordsInSentenceWithInputFromUser(scanner);
        scanner.close();
    }
}