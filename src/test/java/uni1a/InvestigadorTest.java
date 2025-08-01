package uni1a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InvestigadorTest {

    @Test
    public void testConstructorConParametros() {
        Investigador inv = new Investigador("Ana Torres", "PUCE", "Biología");
        assertEquals("Ana Torres", inv.getNombre());
        assertEquals("PUCE", inv.getInstitucion());
        assertEquals("Biología", inv.getAreaEspecializacion());
    }

    @Test
    public void testConstructorDesdeCSVValido() {
        Investigador inv = new Investigador("Luis Gómez,ESPOL,Robótica");
        assertEquals("Luis Gómez", inv.getNombre());
        assertEquals("ESPOL", inv.getInstitucion());
        assertEquals("Robótica", inv.getAreaEspecializacion());
    }

    @Test
    public void testConstructorDesdeCSVInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Investigador("DatoInvalido,SinInstitucion");
        });
        assertEquals("Línea CSV inválida para Investigador.", exception.getMessage());
    }

    @Test
    public void testToCSV() {
        Investigador inv = new Investigador("Carlos Ruiz", "UTPL", "Astronomía");
        String esperado = "Carlos Ruiz,UTPL,Astronomía";
        assertEquals(esperado, inv.toCSV());
    }

    @Test
    public void testToString() {
        Investigador inv = new Investigador("Marta Pérez", "UCE", "Física");
        String esperado = "Marta Pérez (Institución: UCE, Área: Física)";
        assertEquals(esperado, inv.toString());
    }
}
