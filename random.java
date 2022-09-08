/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 10
 */
public class random {
    public static void main (String [] p ){
        
        long c = (long) (Math.pow(2, 31) - 1);
        System.out.println(c);
        long s = c - 2147483647;
        System.out.println(s);
    }
}
