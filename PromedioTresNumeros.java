import java.util.Scanner;

public class PromedioTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- CÁLCULO DEL PROMEDIO ---");
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingresa el tercer número: ");
        double num3 = scanner.nextDouble();

        double promedio = (num1 + num2 + num3) / 3.0;

        System.out.println("\n--- RESULTADO ---");
        System.out.printf("El promedio de los tres números es: %.2f\n", promedio);

        scanner.close();
    }
}