import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double pi = 3.14159;
        double areaDoCirculo = r * r * pi;

        System.out.printf("A=%.4f%n", areaDoCirculo);

        sc.close();
    }
}
