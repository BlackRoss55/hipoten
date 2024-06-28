import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        int a, b;
        double c;

        Scanner veri = new Scanner(System.in);
        System.out.print("a kenarını giriniz : ");
        a = veri.nextInt();
        System.out.print("b kenarını giriniz : ");
        b = veri.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Üçgenin pisagor formülünden gelen c kenarının uzunluğu: " + c);
    }

}
