# Notas-Backend

Este es el backend del proyecto de aplicación de notas.  
Está desarrollado con Java + Spring Boot y expone una API REST para crear, leer, actualizar y eliminar notas (CRUD).

---

Tecnologías utilizadas
- Java 17
- Spring Boot 3 → para crear la API REST de manera rápida.
- Spring Data JPA → para persistencia de datos.
- H2 Database → base de datos liviana, fácil de configurar (en modo archivo para persistencia).
- Maven → para gestionar dependencias y build.

Elegí Spring Boot + H2 porque permiten levantar un backend rápido y funcional sin instalar un motor de base de datos externo.

---

Instalación y ejecución

1. Clonar el repositorio
-bash
-git clone https://github.com/RodriguezPabl/Notas-Backend.git
-cd Notas-Backend

2. Ejecutar el backend
-Desde un IDE (en mi caso Eclipse) ejecutar la clase rodriguezpablo.nota.NotaApplication
-Por defecto corre en http://localhost:8080
