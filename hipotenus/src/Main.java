import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        int a, b;
        double c;

        Scanner input = new Scanner(System.in);

        System.out.print("A kenar uzunluğunu giriniz: ");
        a = input.nextInt();

        System.out.print("B kenar uzunluğunu giriniz: ");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs: " +c);






    }




}