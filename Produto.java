import java.util.Scanner;
public class Produto {
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);
        int valor1 = digitar.nextInt();
        int valor2 = digitar.nextInt();
        int produto = valor1*valor2;
        System.out.printf("PROD = %d\n",produto);
    }
}
