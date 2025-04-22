import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);
        int numeroFuncionaio = digitar.nextInt();
        int horasTrabalhadas = digitar.nextInt();
        double salarioPorHora = digitar.nextDouble();
        double salarioTotal = horasTrabalhadas*salarioPorHora;
        System.out.println("NUMBER = "+numeroFuncionaio);
        System.out.printf("SALARY = U$ %.2f",salarioTotal);
    }
}
