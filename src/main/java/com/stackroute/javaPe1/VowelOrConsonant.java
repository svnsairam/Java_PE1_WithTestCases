/*
Create a program that accepts a word as input and checks for each single character letter in the word whether it is a consonant or vowel.
Condition:
    a. Print an error message if the input is not a letter
    b. If the input having more than one letter, print the required output
          (Vowel or Consonant) for each letter
Input : p
Output : Consonant
Input : ap
Output : Vowel Consonant
 */
package com.stackroute.javaPe1;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String ar[]) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        VowelOrConsonant vowelOrConsonant = new VowelOrConsonant();
        vowelOrConsonant.convertStringToVowelAndConsonant(input);
    }

    public String convertStringToVowelAndConsonant(String input) {
        int asciiValues[] = new int[input.length()];
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            asciiValues[i] = (int) input.charAt(i);
        }
        boolean isProperWord = checkForWord(asciiValues);
        if (isProperWord) {
            for (int i = 0; i < asciiValues.length; i++) {
                switch (asciiValues[i]) {
                    case 65:
                        result.append("Vowel ");
                        break;
                    case 69:
                        result.append("Vowel ");
                        break;
                    case 73:
                        result.append("Vowel ");
                        break;
                    case 79:
                        result.append("Vowel ");
                        break;
                    case 85:
                        result.append("Vowel ");
                        break;
                    case 97:
                        result.append("Vowel ");
                        break;
                    case 101:
                        result.append("Vowel ");
                        break;
                    case 105:
                        result.append("Vowel ");
                        break;
                    case 111:
                        result.append("Vowel ");
                        break;
                    case 117:
                        result.append("Vowel ");
                        break;
                    default:
                        result.append("Consonant ");
                }
            }
        } else {
            result.append("Error Not a proper word");
        }
        return result.toString();
    }

    public boolean checkForWord(int[] asciiValues) {
        for (int i = 0; i < asciiValues.length; i++) {
            if (((asciiValues[i] < 65) || (asciiValues[i] > 122) ||
                    ((asciiValues[i] >= 91) && (asciiValues[i] <= 96)))) {
                return false;
            }
        }
        return true;
    }
}
