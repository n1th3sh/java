/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package missing;

/**
 *
 * @author joker
 */
import java.util.*;
public class Missing {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n+1];
        for(int i=0;i<n-1;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum=(n*(n+1)/2);
        int act=0;
        for(int b:a)
        {
            act+=b;
        }
        int r=sum-act;
        System.out.println(r);
                                                                      
    }
    
}
