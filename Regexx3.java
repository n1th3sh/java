/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package regexx3;

/**
 *
 * @author joker
 */import java.util.Scanner;
public class Regexx3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Read inputs
        String mainString = scanner.nextLine();
        String subString = scanner.nextLine();
        String replaceString = scanner.nextLine();
        scanner.close();

        // Replace substring using regex
        String modifiedString = mainString.replaceAll(subString, replaceString);

        // Print result
        System.out.println(modifiedString);

    }
    
}
