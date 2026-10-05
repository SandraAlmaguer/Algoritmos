import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- CÁLCULO DEL ÍNDICE DE MASA CORPORAL (IMC) ---");
        System.out.print("Ingresa tu peso en kilogramos (ej. 68.5): ");
        double peso = scanner.nextDouble();

        System.out.print("Ingresa tu estatura en metros (ej. 1.65): ");
        double estatura = scanner.nextDouble();

        double imc = peso / (estatura * estatura);

        System.out.println("\n--- RESULTADO ---");
        System.out.printf("Tu Índice de Masa Corporal (IMC) es: %.2f\n", imc);

        scanner.close();
    }
}