package uni1a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContenidoAudiovisualTest {

    // Subclase mock para testear la clase abstracta
    static class ContenidoMock extends ContenidoAudiovisual {
        public ContenidoMock(String titulo, int duracion, String genero) {
            super(titulo, duracion, genero);
        }

        public ContenidoMock(int id, String titulo, int duracion, String genero) {
            super(id, titulo, duracion, genero);
        }

        @Override
        public String detallesComoTexto() {
            return "Mock contenido";
        }
    }

    @Test
    public void testConstructorYGetters() {
        ContenidoMock contenido = new ContenidoMock("Título", 90, "Acción");
        assertEquals("Título", contenido.getTitulo());
        assertEquals(90, contenido.getDuracionEnMinutos());
        assertEquals("Acción", contenido.getGenero());
        assertTrue(contenido.getId() >= 0);
    }

    @Test
    public void testSetters() {
        ContenidoMock contenido = new ContenidoMock("A", 1, "B");
        contenido.setTitulo("Nuevo título");
        contenido.setDuracionEnMinutos(100);
        contenido.setGenero("Comedia");

        assertEquals("Nuevo título", contenido.getTitulo());
        assertEquals(100, contenido.getDuracionEnMinutos());
        assertEquals("Comedia", contenido.getGenero());
    }

    @Test
    public void testConstructorConId() {
        ContenidoMock contenido = new ContenidoMock(42, "ID Manual", 60, "Drama");
        assertEquals(42, contenido.getId());
        assertEquals("ID Manual", contenido.getTitulo());
        assertEquals(60, contenido.getDuracionEnMinutos());
        assertEquals("Drama", contenido.getGenero());
    }
}
