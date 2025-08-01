package uni1a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ActorTest {

    @Test
    public void testConstructorConParametros() {
        Actor actor = new Actor("John", "Doe", "1990-01-01");
        assertEquals("John", actor.getNombre());
        assertEquals("Doe", actor.getApellido());
        assertEquals("1990-01-01", actor.getFechaNacimiento());
    }

    @Test
    public void testConstructorDesdeCSV() {
        Actor actor = new Actor("Jane,Doe,1985-05-15");
        assertEquals("Jane", actor.getNombre());
        assertEquals("Doe", actor.getApellido());
        assertEquals("1985-05-15", actor.getFechaNacimiento());
    }

    @Test
    public void testToCSV() {
        Actor actor = new Actor("Ana", "Pérez", "2000-12-31");
        assertEquals("Ana,Pérez,2000-12-31", actor.toCSV());
    }

    @Test
    public void testToString() {
        Actor actor = new Actor("Luis", "Ramírez", "1975-09-09");
        String esperado = "Luis Ramírez (Nacimiento: 1975-09-09)";
        assertEquals(esperado, actor.toString());
    }

    @Test
    public void testCSVInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Actor("Invalido,SinFecha");
        });
    }
}
