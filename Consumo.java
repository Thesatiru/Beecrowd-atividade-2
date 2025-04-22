import java.util.Scanner;
public class Consumo {
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);
        int X = digitar.nextInt();
        double Y = digitar.nextDouble();
        double resultadoConsumo = X/Y;
        System.out.printf("%.3f km/l\n",resultadoConsumo);
    }
}
