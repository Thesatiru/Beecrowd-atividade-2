import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);
        double A = digitar.nextDouble();
        double B = digitar.nextDouble();
        double C = digitar.nextDouble();
        double media = (A*2+B*3+C*5)/10;
        System.out.printf("MEDIA = %.1f\n",media);
    }
}
