import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        double acilis = 10;
        double kmUcret = 2.20;
        int yol;


        Scanner input = new Scanner(System.in);

        System.out.print("Kaç KM yol gidileceğini giriniz: ");
        yol = input.nextInt();

        double tutar = yol + kmUcret;
        tutar += acilis;


        tutar = (tutar<20)? 20:tutar;
        System.out.println("Toplam ödenecek tutar: " +tutar);












    }






}