import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double boy;
        int kilo;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextInt();


        double kitleIndex = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz: " +kitleIndex);

    }
}
