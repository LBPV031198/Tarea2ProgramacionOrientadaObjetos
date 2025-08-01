package uni1a;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TemporadaTest {

    @Test
    public void testConstructorYGetters() {
        Temporada temporada = new Temporada(3, 12);
        assertEquals(3, temporada.getNumeroTemporada());
        assertEquals(12, temporada.getCantidadEpisodios());
    }

    @Test
    public void testConstructorDesdeCSV() {
        Temporada temporada = new Temporada("5,24");
        assertEquals(5, temporada.getNumeroTemporada());
        assertEquals(24, temporada.getCantidadEpisodios());
    }

    @Test
    public void testSetters() {
        Temporada temporada = new Temporada(1, 10);
        temporada.setNumeroTemporada(2);
        temporada.setCantidadEpisodios(15);

        assertEquals(2, temporada.getNumeroTemporada());
        assertEquals(15, temporada.getCantidadEpisodios());
    }

    @Test
    public void testDetallesComoTexto() {
        Temporada temporada = new Temporada(4, 8);
        String detalles = temporada.detallesComoTexto();
        assertEquals("Temporada 4: 8 episodios", detalles);
    }

    @Test
    public void testToCSV() {
        Temporada temporada = new Temporada(7, 20);
        assertEquals("7,20", temporada.toCSV());
    }
}
