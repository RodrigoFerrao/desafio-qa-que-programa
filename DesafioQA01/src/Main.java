import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lerNumero = new Scanner(System.in);
        int numeroRecebido = lerNumero.nextInt();
        System.out.println((numeroRecebido % 2 == 0) ? "O Número inserido é par" : "O Número inserido é ímpar");
    }
}
