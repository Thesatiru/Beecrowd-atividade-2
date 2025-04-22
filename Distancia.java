import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);
        int minutos = digitar.nextInt();
        int distancia = minutos*2;
        System.out.println(distancia+" minutos");
    }
}
