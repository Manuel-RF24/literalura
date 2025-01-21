package com.example.literAlura;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class LiterAluraApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LiterAluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Bienvenido al Catálogo LiterAlura");
			System.out.println("1. Ver todos los libros");
			System.out.println("2. Buscar un libro por título");
			System.out.println("3. Añadir un libro");
			System.out.println("4. Salir");

			System.out.print("Selecciona una opción (1-4): ");
			int opcion = scanner.nextInt();
			scanner.nextLine();  // Limpiar el buffer de la línea

			switch (opcion) {
				case 1:
					mostrarLibros();
					break;
				case 2:
					System.out.print("Introduce el título del libro: ");
					String titulo = scanner.nextLine();
					buscarLibroPorTitulo(titulo);
					break;
				case 3:
					System.out.print("Introduce el título del nuevo libro: ");
					String nuevoTitulo = scanner.nextLine();
					System.out.print("Introduce el autor del nuevo libro: ");
					String autor = scanner.nextLine();
					agregarLibro(nuevoTitulo, autor);
					break;
				case 4:
					System.out.println("¡Gracias por usar LiterAlura! Adiós.");
					scanner.close();
					return;
				default:
					System.out.println("Opción no válida, por favor elige una opción entre 1 y 4.");
					break;
			}
		}
	}

	private void mostrarLibros() {
		System.out.println("Mostrando todos los libros...");
	}

	private void buscarLibroPorTitulo(String titulo) {
		System.out.println("Buscando el libro con el título: " + titulo);
	}

	private void agregarLibro(String titulo, String autor) {
		System.out.println("Añadiendo el libro: " + titulo + " por " + autor);
	}
}
