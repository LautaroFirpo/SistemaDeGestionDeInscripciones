# Sistema de Gestión de Inscripciones - Gimnasio (POO)

Este proyecto es un simulacro de examen desarrollado en **Java** para la materia **Programación Orientada a Objetos (POO)**. El sistema simula la administración de inscripciones de socios de un gimnasio mediante la lectura de archivos planos, la aplicación de principios fundamentales de la POO y lógica de control clásica (bucles y condicionales).

## 🚀 Arquitectura del Proyecto

El diseño del software sigue una arquitectura en capas para garantizar el desacoplamiento y las buenas prácticas de desarrollo:

* **`model`**: Contiene la definición de las entidades y la lógica polimórfica.
* **`repo` / `repoImp`**: Capa encargada del acceso a datos (Lectura de archivos con `BufferedReader`).
* **`servicio` / `servicioImp`**: Capa de negocio que procesa las colecciones de datos mediante lógica clásica.
* **`inicio`**: Clase `Main` con un menú interactivo por consola.

## 🛠️ Conceptos de POO Aplicados

* **Clases Abstractas:** Uso de la clase base `Inscripcion` que no permite instanciarse directamente.
* **Herencia:** Especialización de las clases hijas `InscripcionInicial` e `InscripcionPaseLibre`.
* **Polimorfismo:** Redefinición del método abstracto `calcularCostoFinal()` mediante la anotación `@Override`.
* **Encapsulamiento:** Atributos privados con acceso restringido mediante Getters y Setters.
* **Manejo de Colecciones Polimórficas:** Agrupación de objetos tipo inicial y pase libre dentro de una estructura `List<Inscripcion>`.
* **Identificación Dinámica de Tipos:** Uso del operador `instanceof` para clasificar objetos en tiempo de ejecución.

## 📋 Requisitos del Negocio Implementados

A través de un menú interactivo controlado por teclado (`Scanner`), el sistema permite:

1.  **Mostrar inscripciones:** Lista el socio junto a su costo final calculado de forma polimórfica.
2.  **Buscar por código:** Localiza una inscripción específica eficientemente cortando el bucle con `break`.
3.  **Calcular recaudación total:** Sumatoria acumulada de todas las inscripciones.
4.  **Inscripción con mayor costo:** Algoritmo tradicional de búsqueda de máximos.
5.  **Contar Pase Libre:** Totalización de inscripciones específicas mediante `instanceof`.
6.  **Filtro por valor:** Muestra los socios cuyo costo final supere un umbral determinado ($80.000).
7.  **Cálculo de Promedios:** Promedio de costos para inscripciones iniciales, blindado contra errores de división por cero (`cant > 0`).
8.  **Manipulación de Strings:** Formateo de los nombres de los socios a mayúsculas.

## 📂 Formato de Datos (`inscripciones.txt`)

Los datos se leen desde un archivo de texto separado por punto y coma `;` con la siguiente estructura:

* **Inicial (I):** `tipo;codigo;socio;mesesContratados;precioPorMes`
* **Pase Libre (P):** `tipo;codigo;socio;mesesContratados;precioPorMes;disciplinaExtra`

---
*Desarrollado como material de práctica para el examen recuperatorio de Programación Orientada a Objetos.*
