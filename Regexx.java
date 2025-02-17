/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package regexx;

/**
 *
 * @author joker
 */
import java.util.Scanner;
public class Regexx {
    public static void main(String[] args) 
    {
       
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        scanner.close();

        int totalChars = sentence.length();
        int numWords = sentence.split("\\s+").length;
        int numVowels = sentence.replaceAll("[^aeiouAEIOU]", "").length();
        int numConsonants = sentence.replaceAll("[^bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", "").length();
        String reversedSentence = new StringBuilder(sentence).reverse().toString();

        System.out.println("Total number of characters: " + totalChars);
        System.out.println("Number of words: " + numWords);
        System.out.println("Number of vowels: " + numVowels);
        System.out.println("Number of consonants: " + numConsonants);
        System.out.println("Reversed sentence: " + reversedSentence);
    }
    
}
