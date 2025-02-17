/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package regexx2;

/**
 *
 * @author joker
 */
 import java.util.Scanner;
public class Regexx2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        scanner.close();

        // Extract lowercase letters, spaces, and punctuation
        String lowerPart = sentence.replaceAll("[A-Z]", "");
        // Extract uppercase letters
        String upperPart = sentence.replaceAll("[^A-Z]", "");

        // Combine and print result
        System.out.println(lowerPart + upperPart);
    }
    
}
