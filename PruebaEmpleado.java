import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
public class PruebaEmpleado {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese nombre del empleado 1:");
        String nombre1 = sc.nextLine();
        System.out.println("Ingrese apellido del empleado 1:");
        String apellido1 = br.readLine();
        double salario1 = Double.parseDouble(JOptionPane.showInputDialog("Salario mensual empleado 1:"));
        System.out.println("Ingrese nombre del empleado 2:");
        String nombre2 = sc.nextLine();
        System.out.println("Ingrese apellido del empleado 2:");
        String apellido2 = br.readLine();
        double salario2 = Double.parseDouble(JOptionPane.showInputDialog("Salario mensual empleado 2:"));
        Empleado emp1 = new Empleado(nombre1, apellido1, salario1);
        Empleado emp2 = new Empleado(nombre2, apellido2, salario2);
        String antes = "SALARIO ANUAL ANTES DEL AUMENTO\n"
                + emp1.getNombre() + ": " + emp1.salarioAnual() + "\n"
                + emp2.getNombre() + ": " + emp2.salarioAnual();
        JOptionPane.showMessageDialog(null, antes);
        emp1.aumentarSalario();
        emp2.aumentarSalario();
        String despues = "SALARIO ANUAL DESPUES DEL AUMENTO\n"
                + emp1.getNombre() + ": " + emp1.salarioAnual() + "\n"
                + emp2.getNombre() + ": " + emp2.salarioAnual();
        JOptionPane.showMessageDialog(null, despues);
        sc.close();
    }
}
