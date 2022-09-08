package percobaan;
import java.util.Scanner;
public class percobaan3 {
    static double hitungBunga(double saldo, int tahun) {
        if(tahun == 0) {
            return saldo;
        }
        else {
            return 1.11 * hitungBunga(saldo, tahun - 1);
        }            
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldoAwal;
        int lamaMenabung;
        
        System.out.print("jumlah saldo awal : ");
        saldoAwal = input.nextDouble();
        System.out.print("lama menabung (tahun) : ");
        lamaMenabung = input.nextInt();
        
        System.out.println(hitungBunga(saldoAwal,lamaMenabung));
        
    }
    
}
