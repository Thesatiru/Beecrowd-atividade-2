import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);
        int A = digitar.nextInt();
        int B = digitar.nextInt();
        int C = digitar.nextInt();
        int D = digitar.nextInt();
        int diferenca = (A*B-C*D);
        System.out.println("DIFERENCA = "+diferenca);
    }
}
