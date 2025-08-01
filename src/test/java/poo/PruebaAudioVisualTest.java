package poo;

import org.junit.jupiter.api.Test;
import uni1a.ContenidoAudiovisual;
import util.ArchivoUtil;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PruebaAudioVisualTest {

    @Test
    public void testGeneracionYLecturaCSV() {
        // Ejecutar main
        PruebaAudioVisual.main(null);

        File archivo = new File("contenidos.csv");

        // Verificar que el archivo se creó
        assertTrue(archivo.exists(), "El archivo contenidos.csv debería haberse creado.");

        // Verificar que contiene datos válidos
        List<ContenidoAudiovisual> cargados = ArchivoUtil.cargarContenidosCSV("contenidos.csv");
        assertNotNull(cargados, "La lista de contenidos no debería ser null.");
        assertEquals(5, cargados.size(), "Se esperaban 5 contenidos cargados.");
        
        for (ContenidoAudiovisual contenido : cargados) {
            assertNotNull(contenido, "El contenido no debería ser null.");
            assertNotNull(contenido.getTitulo(), "El título del contenido no debería ser null.");
        }
    }
}
