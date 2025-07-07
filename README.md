Proyecto de Gestión de Contenidos Audiovisuales
Este proyecto Java es una ampliación de un sistema básico de gestión de contenidos audiovisuales, aplicando y consolidando conceptos fundamentales de la Programación Orientada a Objetos (POO) como la herencia, la asociación, la agregación y la composición. El objetivo principal es modelar de manera más completa diferentes tipos de contenido audiovisual y sus relaciones con entidades relevantes.

Descripción del Proyecto
El sistema permite la creación y gestión de diversos tipos de contenidos audiovisuales, tales como películas, series de televisión, documentales, videos musicales y podcasts. La aplicación está diseñada para demostrar cómo la herencia permite reutilizar código y cómo las relaciones entre clases (asociación, agregación y composición) modelan interacciones del mundo real, proporcionando una estructura robusta y extensible.

Características Principales:
Herencia: ContenidoAudiovisual como clase abstracta base, de la cual heredan Pelicula, SerieDeTV, Documental, VideoMusical y Podcast.

Asociación/Agregación:

Pelicula se asocia con Actores (agregación), permitiendo que una película tenga múltiples actores en su reparto.

Documental se asocia con Investigadores (agregación), permitiendo listar a los profesionales que contribuyeron en la investigación.

Composición:

SerieDeTV se compone de Temporadas, donde cada temporada es una parte integral de la serie y no existe de forma independiente.

Modularidad: El diseño orientado a objetos facilita la adición de nuevos tipos de contenido o nuevas relaciones en el futuro.

Clases y Funcionalidades Nuevas
Se han incorporado las siguientes clases y se han extendido las funcionalidades de las clases existentes:

Actor:

Atributos: nombre, apellido, fechaNacimiento.

Relación: Agregación con Pelicula. Una Pelicula puede tener una lista de Actores.

Temporada:

Atributos: numeroTemporada, cantidadEpisodios.

Relación: Composición con SerieDeTV. Una SerieDeTV contiene una lista de Temporadas.

Investigador:

Atributos: nombre, institucion, areaEspecializacion.

Relación: Agregación con Documental. Un Documental puede tener una lista de Investigadores.

VideoMusical (Nueva Subclase de ContenidoAudiovisual):

Atributos: artista, album.

Funcionalidad: Muestra detalles específicos de un video musical.

Podcast (Nueva Subclase de ContenidoAudiovisual):

Atributos: anfitrion, plataformaDistribucion.

Funcionalidad: Muestra detalles específicos de un podcast.

Estructura de Carpetas
El proyecto sigue una estructura de carpetas estándar para proyectos Java:

.
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── poo/
│   │       │   └── PruebaAudioVisual.java
│   │       └── uni1a/
│   │           ├── ContenidoAudiovisual.java
│   │           ├── Actor.java
│   │           ├── Temporada.java
│   │           ├── Investigador.java
│   │           ├── Pelicula.java
│   │           ├── SerieDeTV.java
│   │           ├── Documental.java
│   │           ├── VideoMusical.java
│   │           └── Podcast.java
│   └── test/
│       └── ... (si se añaden pruebas unitarias)
└── README.md

Instrucciones de Instalación y Uso
Para clonar y ejecutar este proyecto en tu entorno local (preferiblemente Eclipse, como se indica en la actividad):

1. Clonar el Repositorio
Abre tu terminal o Git Bash y ejecuta el siguiente comando:

git clone <URL_DE_TU_REPOSITORIO_GITHUB>

Reemplaza <URL_DE_TU_REPOSITORIO_GITHUB> con la URL real de tu repositorio.

2. Importar el Proyecto en Eclipse
Abre Eclipse.

Ve a File > Import....

Selecciona Git > Projects from Git y haz clic en Next.

Elige Clone URI y haz clic en Next.

Pega la URL de tu repositorio de GitHub en el campo URI y haz clic en Next.

Selecciona la rama main (o la que corresponda) y haz clic en Next.

Elige un directorio local para el proyecto y haz clic en Next.

Asegúrate de que la opción Import as general project esté seleccionada y haz clic en Next.

Haz clic en Finish.

Una vez importado como proyecto general, haz clic derecho en el proyecto en el Package Explorer, selecciona Configure > Convert to Maven Project o Convert to Gradle Project si usas esos sistemas de construcción, o simplemente asegúrate de que sea un proyecto Java y las rutas de origen estén configuradas correctamente.

3. Ejecutar la Aplicación
En Eclipse, navega hasta src/main/java/poo/PruebaAudioVisual.java.

Haz clic derecho en PruebaAudioVisual.java.

Selecciona Run As > Java Application.

La salida del programa se mostrará en la consola de Eclipse, mostrando los detalles de las diferentes instancias de contenidos audiovisuales y sus relaciones.

Mejoras Adicionales (Opcional)
Pruebas Unitarias: Se podrían añadir pruebas unitarias (JUnit) para asegurar la correcta funcionalidad de cada clase y método.

Optimización de Código: Refinamiento de la lógica para mejorar la eficiencia o legibilidad.

Interfaz de Usuario: Implementación de una interfaz gráfica (GUI) utilizando Swing, JavaFX o una aplicación web para una interacción más amigable.

Nota sobre GitHub:
Este proyecto debe contener al menos 3 commits adicionales después de la importación inicial, reflejando el progreso de las etapas de ampliación.