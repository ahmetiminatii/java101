import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        double ucret;
        double kdvOran = 0.18;

        Scanner input = new Scanner(System.in);

        System.out.print("Para tutarını giriniz: ");
        ucret = input.nextDouble();

        double kdv = ucret * kdvOran;
        double kdvliFiyat = ucret + kdv;

        System.out.println("KDV Tutarı: " +kdvOran);
        System.out.print("KDV'Li Fiyat: " +kdvliFiyat);







    }




}