import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;
        int kacKgArmut, kacKgElma, kacKgDomates, kacKgMuz, kacKgPatlican;


        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kilo armut alındı?: ");
        kacKgArmut = input.nextInt();

        System.out.print("Kaç kilo elma alındı?: ");
        kacKgElma = input.nextInt();

        System.out.print("Kaç kilo domates alındı?: ");
        kacKgDomates = input.nextInt();

        System.out.print("Kaç kilo muz alındı?: ");
        kacKgMuz = input.nextInt();

        System.out.print("Kaç kilo patlıcan alındı?: ");
        kacKgPatlican = input.nextInt();

        double toplam = (armut * kacKgArmut) + (elma * kacKgElma) + (domates * kacKgDomates) + (muz * kacKgMuz) + (patlican * kacKgPatlican);

        System.out.print("Toplam tutar: " +toplam);







    }
}
