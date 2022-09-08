package percobaan;
import java.util.Scanner;
public class percobaan2 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return 1;
        }
        else {
            return x * hitungPangkat(x,y - 1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan,pangkat;
        
        System.out.print("Bialangan yang dihitung : ");
        bilangan = input.nextInt();
        System.out.print("Masuikkan pangkat ");
        pangkat = input.nextInt();
        
        System.out.println(hitungPangkat(bilangan,pangkat));
    }  
}
