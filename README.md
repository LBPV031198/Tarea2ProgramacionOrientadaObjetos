# 📽️ Contenido Audiovisual – Proyecto Java

Este repositorio implementa un sistema de gestión de contenidos audiovisuales en Java, siguiendo principios de POO, MVC, manejo de archivos CSV y pruebas unitarias con JUnit 5.

---

---

## 🚀 Instalación y Ejecución

1. **Clona el repositorio**  
   `git clone https://github.com/LBPV031198/Tarea2ProgramacionOrientadaObjetos.git`

2. **Compila con Maven**  
   `mvn clean compile`

3. **Ejecuta la aplicación**  
   `java --enable-preview -cp target/classes poo.PruebaAudioVisual    `

   Verás en consola un listado de Películas, Series, Documentales, Videos Musicales y Podcasts, y se generará `contenidos.csv`.

---

## ✅ Pruebas Unitarias

Lanza todos los tests con JUnit 5:

```bash
mvn test

🔧 Cambios y Mejoras
Modelo MVC ligero

ControladorContenido separa la lógica de negocio del modelo (uni1a/) y la vista (consola).

CSV unificado

ArchivoUtil puede guardar y cargar TODOS los tipos de contenido en un solo contenidos.csv.

Métodos detallesComoTexto()

Devuelven cadenas en lugar de imprimir directamente para facilitar pruebas y separación de responsabilidades.

Constructores/toCSV()

Cada subclase (Pelicula, SerieDeTV, Documental, VideoMusical, Podcast) soporta inicialización desde CSV y conversión a CSV.

Pruebas exhaustivas

Casos normales y límite cubiertos con JUnit 5, asegurando fiabilidad y detectando regresiones.
