import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner input =new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        double ortalama = (mat+ fizik + kimya + turkce + tarih + muzik) / 6.0;
        System.out.println("Ortalamanız: " +ortalama);

        String durum = (ortalama > 60) ? "Sınıfı geçti." : "Sınıfta kaldı.";
        System.out.println("Sınıfı geçme durumu: " +durum);

    }
}