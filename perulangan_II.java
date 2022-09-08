
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 10
 */
public class perulangan_II {
    public static void main (String [] s ){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            // ( a + 2/pangkat perul * b)
            
            for ( int p = 0;p < t; p++){
                double c = a + Math.pow(2, p) * b;
                System.out.println(c);
            }
            
        }
    }
}
