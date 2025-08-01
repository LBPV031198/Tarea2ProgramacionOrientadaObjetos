package uni1a;

public class Actor {
    private String nombre;
    private String apellido;
    private String fechaNacimiento;

    public Actor(String nombre, String apellido, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Actor(String lineaCSV) {
        String[] partes = lineaCSV.split(",");
        if (partes.length == 3) {
            this.nombre = partes[0].trim();
            this.apellido = partes[1].trim();
            this.fechaNacimiento = partes[2].trim();
        } else {
            throw new IllegalArgumentException("Formato CSV inválido para Actor.");
        }
    }

    public String toCSV() {
        return nombre + "," + apellido + "," + fechaNacimiento;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    @Override
    public String toString() {
        return nombre + " " + apellido + " (Nacimiento: " + fechaNacimiento + ")";
    }
}
