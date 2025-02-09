/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package second;

/**
 *
 * @author joker
 */
import java.util.*;
public class Second {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int lar=0;
        for(int j=0;j<n;j++)
        {
            if(a[j]>lar)
            {
                lar=a[j];
            }
        }
        int sec=0;
        for(int k=0;k<n;k++)
        {
            if(a[k]==lar)
            {
                a[k]=0;
            }
            else
            {
                    if(a[k]>sec)
                        sec=a[k];
                    
            }
        }
        System.out.println(sec);
        
        
    }
    
}
