package uni1a;

public class Investigador {
    private String nombre;
    private String institucion;
    private String areaEspecializacion;

    public Investigador(String nombre, String institucion, String areaEspecializacion) {
        this.nombre = nombre;
        this.institucion = institucion;
        this.areaEspecializacion = areaEspecializacion;
    }

    public Investigador(String lineaCSV) {
        String[] partes = lineaCSV.split(",");
        if (partes.length == 3) {
            this.nombre = partes[0].trim();
            this.institucion = partes[1].trim();
            this.areaEspecializacion = partes[2].trim();
        } else {
            throw new IllegalArgumentException("Línea CSV inválida para Investigador.");
        }
    }

    public String toCSV() {
        return nombre + "," + institucion + "," + areaEspecializacion;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getInstitucion() { return institucion; }
    public void setInstitucion(String institucion) { this.institucion = institucion; }

    public String getAreaEspecializacion() { return areaEspecializacion; }
    public void setAreaEspecializacion(String areaEspecializacion) { this.areaEspecializacion = areaEspecializacion; }

    @Override
    public String toString() {
        return nombre + " (Institución: " + institucion + ", Área: " + areaEspecializacion + ")";
    }
}
