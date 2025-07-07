# Proyecto de Gestión de Contenidos Audiovisuales

Este proyecto Java es una ampliación de un sistema básico de gestión de contenidos audiovisuales, aplicando y consolidando conceptos fundamentales de la Programación Orientada a Objetos (POO) como la herencia, la asociación, la agregación y la composición. El objetivo principal es modelar de manera más completa diferentes tipos de contenido audiovisual y sus relaciones con entidades relevantes.

## Descripción del Proyecto

El sistema permite la creación y gestión de diversos tipos de contenidos audiovisuales, tales como películas, series de televisión, documentales, videos musicales y podcasts. La aplicación está diseñada para demostrar cómo la herencia permite reutilizar código y cómo las relaciones entre clases (asociación, agregación y composición) modelan interacciones del mundo real, proporcionando una estructura robusta y extensible.

### Características Principales:

* **Herencia:** `ContenidoAudiovisual` como clase abstracta base, de la cual heredan `Pelicula`, `SerieDeTV`, `Documental`, `VideoMusical` y `Podcast`.

* **Asociación/Agregación:**
    * `Pelicula` se asocia con `Actor`es (**agregación**), permitiendo que una película tenga múltiples actores en su reparto.
    * `Documental` se asocia con `Investigador`es (**agregación**), permitiendo listar a los profesionales que contribuyeron en la investigación.

* **Composición:**
    * `SerieDeTV` se compone de `Temporada`s, donde cada temporada es una parte integral de la serie y no existe de forma independiente.

* **Modularidad:** El diseño orientado a objetos facilita la adición de nuevos tipos de contenido o nuevas relaciones en el futuro.

## Clases y Funcionalidades Nuevas

Se han incorporado las siguientes clases y se han extendido las funcionalidades de las clases existentes:

* **`Actor`**:
    * **Atributos:** `nombre`, `apellido`, `fechaNacimiento`.
    * **Relación:** Agregación con `Pelicula`. Una `Pelicula` puede tener una lista de `Actor`es.

* **`Temporada`**:
    * **Atributos:** `numeroTemporada`, `cantidadEpisodios`.
    * **Relación:** Composición con `SerieDeTV`. Una `SerieDeTV` contiene una lista de `Temporada`s.

* **`Investigador`**:
    * **Atributos:** `nombre`, `institucion`, `areaEspecializacion`.
    * **Relación:** Agregación con `Documental`. Un `Documental` puede tener una lista de `Investigador`es.

* **`VideoMusical` (Nueva Subclase de `ContenidoAudiovisual`)**:
    * **Atributos:** `artista`, `album`.
    * **Funcionalidad:** Muestra detalles específicos de un video musical.

* **`Podcast` (Nueva Subclase de `ContenidoAudiovisual`)**:
    * **Atributos:** `anfitrion`, `plataformaDistribucion`.
    * **Funcionalidad:** Muestra detalles específicos de un podcast.
## Instrucciones de Instalación y Uso

Para ejecutar este proyecto en tu entorno local (preferiblemente Eclipse, como se indica en la actividad):

### 1. Obtener el Proyecto

Asegúrate de tener todos los archivos Java del proyecto en tu sistema de archivos local, organizados según la estructura de carpetas mostrada arriba.

### 2. Importar el Proyecto en Eclipse

1.  Abre Eclipse.
2.  Ve a `File` > `Import...`.
3.  Selecciona `General` > `Existing Projects into Workspace` y haz clic en `Next`.
4.  Haz clic en `Browse...` junto a "Select root directory:" y selecciona la carpeta raíz de tu proyecto (la que contiene `src/`).
5.  Asegúrate de que el proyecto aparezca en la lista y esté seleccionado. Haz clic en `Finish`.
6.  Una vez importado, asegúrate de que Eclipse lo reconozca como un proyecto Java. Si no es así, haz clic derecho en el proyecto en el `Package Explorer`, selecciona `Configure` > `Convert to Java Project`.

### 3. Ejecutar la Aplicación

1.  En Eclipse, navega hasta `src/main/java/poo/PruebaAudioVisual.java`.
2.  Haz clic derecho en `PruebaAudioVisual.java`.
3.  Selecciona `Run As` > `Java Application`.

La salida del programa se mostrará en la consola de Eclipse, mostrando los detalles de las diferentes instancias de contenidos audiovisuales y sus relaciones.

## Mejoras Adicionales (Opcional)

* **Pruebas Unitarias:** Se podrían añadir pruebas unitarias (JUnit) para asegurar la correcta funcionalidad de cada clase y método.
* **Optimización de Código:** Refinamiento de la lógica para mejorar la eficiencia o legibilidad.
* **Interfaz de Usuario:** Implementación de una interfaz gráfica (GUI) utilizando Swing, JavaFX o una aplicación web para una interacción más amigable.

**Nota sobre GitHub:**
Este proyecto debe contener al menos **3 commits adicionales** después de la importación inicial, reflejando el progreso de las etapas de ampliación.

