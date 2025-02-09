/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rotated;

import java.util.Scanner;

/**
 *
 * @author joker
 */
public class Rotated {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            if(j==0)
            {
                b[j]=a[n-1];
            }
            else if(j<n)
            {
                b[j]=a[j-1];
            }
            
            System.out.println("actual values "+a[j]);
            System.out.println("rotated values "+b[j]);
            
        }
        
    }
    
}
