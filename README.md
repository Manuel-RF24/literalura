# LiterAlura - Catálogo de Libros y Autores

## Descripción
**LiterAlura** es una aplicación que permite realizar consultas sobre libros y autores, extrayendo información de la API de Gutendex. Los usuarios pueden buscar libros por título, consultar autores vivos en un año determinado y obtener estadísticas sobre los libros almacenados en la base de datos. Además, la aplicación está integrada con una base de datos PostgreSQL donde se guardan tanto los libros como los autores.

## Funcionalidades
1. **Búsqueda de libros por título**: Consulta libros a través de su título.
2. **Listado de autores vivos en un año determinado**: Consulta autores vivos en el año indicado.
3. **Estadísticas de libros por idioma**: Consulta la cantidad de libros en diferentes idiomas.
4. **Almacenamiento y consulta en base de datos PostgreSQL**: Guarda libros y autores en la base de datos para consultas posteriores.

## Tecnologías utilizadas
- **Java 17**: Lenguaje de programación.
- **Spring Boot**: Framework para el desarrollo del proyecto.
- **Spring Data JPA**: Para la gestión de la base de datos con PostgreSQL.
- **PostgreSQL**: Base de datos relacional para almacenar los libros y autores.
- **Jackson**: Para procesar el JSON recibido de la API de Gutendex.
- **API de Gutendex**: Para obtener información de libros y autores.

## Requisitos
1. **Java 17** o superior.
2. **PostgreSQL** instalado y configurado.
3. **Maven** como herramienta de gestión de dependencias.

## Instalación

### 1. Clonar el repositorio
```bash
git clone https://github.com/Manuel-RF24/literalura.git
cd literalura
