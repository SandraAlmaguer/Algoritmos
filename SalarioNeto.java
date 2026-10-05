import java.util.Scanner;

public class SalarioNeto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- CÁLCULO DEL SALARIO NETO ---");
        System.out.print("Ingresa el salario bruto mensual: ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Ingresa el porcentaje de impuestos (ej. 15 para 15%): ");
        double porcentajeImpuestos = scanner.nextDouble();

        System.out.print("Ingresa las deducciones adicionales: ");
        double deduccionesAdicionales = scanner.nextDouble();

        // Aplicación de la fórmula
        double impuesto = (salarioBruto * porcentajeImpuestos) / 100.0;
        double salarioNeto = salarioBruto - impuesto - deduccionesAdicionales;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Salario Bruto: $" + salarioBruto);
        System.out.println("Monto de Impuestos: $" + impuesto);
        System.out.println("Deducciones Adicionales: $" + deduccionesAdicionales);
        System.out.println("Salario Neto Final: $" + salarioNeto);

        scanner.close();
    }
}
