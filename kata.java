/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan;

import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeString;

/**
 *
 * @author WINDOWS 10
 */
public class kata {
    
    public static String pbaru = null;
    
    public static void main (String []args ){
        Scanner ip = new Scanner(System.in);
        System.out.print("Text : ");
        String p = ip.nextLine();
        
        if(p.contains("a")|| p.contains("A")){
           String pbaru1 = p.replace("a", "4");
           pbaru = pbaru1;
        }else {
            pbaru = p;
        }
        if(pbaru .contains("o")){
            String pbaru2 = pbaru.replace("o", "0");
            pbaru = pbaru2;
        }
        System.out.println(pbaru);

    }
}
