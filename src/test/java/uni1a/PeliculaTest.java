package uni1a;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class PeliculaTest {

    @Test
    public void testConstructorYGetters() {
        List<Actor> reparto = new ArrayList<>();
        reparto.add(new Actor("Actor1", "Apellido1", "01/01/1970"));
        reparto.add(new Actor("Actor2", "Apellido2", "02/02/1980"));
        
        Pelicula pelicula = new Pelicula("Prueba", 120, "Drama", "Estudio", reparto);
        
        assertEquals("Prueba", pelicula.getTitulo());
        assertEquals(120, pelicula.getDuracionEnMinutos());
        assertEquals("Drama", pelicula.getGenero());
        assertEquals("Estudio", pelicula.getEstudio());
        assertEquals(2, pelicula.getReparto().size());
        assertEquals("Actor1", pelicula.getReparto().get(0).getNombre());
    }

    @Test
    public void testSetters() {
        Pelicula pelicula = new Pelicula("Prueba", 120, "Drama", "Estudio", null);
        
        pelicula.setTitulo("Nuevo Titulo");
        pelicula.setDuracionEnMinutos(150);
        pelicula.setGenero("Comedia");
        pelicula.setEstudio("Nuevo Estudio");
        
        assertEquals("Nuevo Titulo", pelicula.getTitulo());
        assertEquals(150, pelicula.getDuracionEnMinutos());
        assertEquals("Comedia", pelicula.getGenero());
        assertEquals("Nuevo Estudio", pelicula.getEstudio());
    }

    @Test
    public void testAgregarActor() {
        Pelicula pelicula = new Pelicula("Prueba", 120, "Drama", "Estudio", null);
        pelicula.agregarActor(new Actor("NuevoActor", "Apellido", "03/03/1990"));
        
        assertEquals(1, pelicula.getReparto().size());
        assertEquals("NuevoActor", pelicula.getReparto().get(0).getNombre());
    }

    @Test
    public void testToCSV() {
        List<Actor> reparto = new ArrayList<>();
        reparto.add(new Actor("Actor1", "Apellido1", "01/01/1970"));
        reparto.add(new Actor("Actor2", "Apellido2", "02/02/1980"));

        Pelicula pelicula = new Pelicula(1, "Prueba", 120, "Drama", "Estudio", "Actor1;Actor2");
        
        String csv = pelicula.toCSV();
        // Debe incluir id, titulo, duracion, genero, estudio, y actores separados por ;
        assertTrue(csv.contains("1,Prueba,120,Drama,Estudio"));
        assertTrue(csv.contains("Actor1;Actor2"));
    }

    @Test
    public void testDetallesComoTexto() {
        List<Actor> reparto = new ArrayList<>();
        reparto.add(new Actor("Actor1", "Apellido1", "01/01/1970"));

        Pelicula pelicula = new Pelicula("Prueba", 120, "Drama", "Estudio", reparto);
        String detalles = pelicula.detallesComoTexto();

        assertTrue(detalles.contains("Película: Prueba"));
        assertTrue(detalles.contains("Estudio: Estudio"));
        assertTrue(detalles.contains("Actor1 Apellido1"));
        assertTrue(detalles.contains("Duración: 120 min"));
    }
}
