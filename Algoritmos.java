import java.util.Scanner;
public class Algoritmos {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Se solicita al usuario un número entero positivo como límite.
        System.out.println("Introduzca un número entero positivo: ");
        int n = scanner.nextInt();

        // Se calculan los números primos.
        int[] primos = calcularNumerosPrimos(n);

        // Se imprimen los números primos.
        System.out.println("Números primos:");
        for (int primo : primos) {
            System.out.print(primo + " ");
        }

        System.out.println();

        // Se calculan los números de la sucesión de Fibonacci.
        int[] fibonacci = calcularFibonacci(n);

        // Se imprimen los números de la sucesión de Fibonacci.
        System.out.println("Sucesión de Fibonacci:");
        for (int numero : fibonacci) {
            System.out.print(numero + " ");
        }
    }
    private static int[] calcularNumerosPrimos(int n) {
        int[] primos = new int[n];
        int count = 0;

        for (int i = 2; i <= n; i++) {
            boolean esPrimo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                primos[count++] = i;
            }
        }

        return primos;
    }

    private static int[] calcularFibonacci(int n) {
        int[] fibonacci = new int[n];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }
}
