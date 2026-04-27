public class Empleado {
    private String nombre;
    private String apellido;
    private double salarioMensual;
    public Empleado(String nombre, String apellido, double salarioMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        if (salarioMensual > 0) {
            this.salarioMensual = salarioMensual;
        } else {
            this.salarioMensual = 0.0;
        }
    }

    // SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0) {
            this.salarioMensual = salarioMensual;
        }
    }
    // GET
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public double getSalarioMensual() {
        return salarioMensual;
    }
    // Método salario anual
    public double salarioAnual() {
        return salarioMensual * 12;
    }
    // Método aumento 10%
    public void aumentarSalario() {
        salarioMensual = salarioMensual * 1.10;
    }
}
