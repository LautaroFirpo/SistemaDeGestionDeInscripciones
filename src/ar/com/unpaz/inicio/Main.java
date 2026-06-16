package ar.com.unpaz.inicio;

import java.util.List;
import java.util.Scanner;
<<<<<<< HEAD

import ar.com.unpaz.model.Alquiler;
import ar.com.unpaz.repositorio.LecturaArchivoAlquiler;
import ar.com.unpaz.repositorio.LecturaArchivoHabitacion;
import ar.com.unpaz.repositorioImp.LecturaArchivoAlquilerImp;
import ar.com.unpaz.repositorioImp.LecturaArchivoHabitacionImp;
import ar.com.unpaz.servicio.LogicaAlquiler;
import ar.com.unpaz.servicioImp.LogicaAlquilerImp;
=======
import ar.com.unpaz.model.Inscripcion;
import ar.com.unpaz.repositorio.LecturaArchivo;
import ar.com.unpaz.repositorioImp.LecturaArchivoImp;
import ar.com.unpaz.servicio.LogicaInscripciones;
import ar.com.unpaz.servicioImp.LogicaInscripcionesImp;
>>>>>>> cdc977a74060fd6bfdfe7f4e0cbbe8c9fe461d98

public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD
    	LecturaArchivoHabitacion habitaciones = new LecturaArchivoHabitacionImp();
        LecturaArchivoAlquiler repo = new LecturaArchivoAlquilerImp(habitaciones);
        LogicaAlquiler servicio = new LogicaAlquilerImp();
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("=== SISTEMA DE GESTIÓN DE ALQUILERES DE HOTELES ===");
        System.out.println("Iniciando carga de datos (Habitaciones + Alquileres)...");
        
        List<Alquiler> listaAlquileres = repo.obtenerAlquileres();
       	
        if (listaAlquileres == null || listaAlquileres.isEmpty()) {
            System.out.println("Error crítico: No se pudieron procesar los archivos de datos. Saliendo.");
            teclado.close();
            return;
        }
        System.out.println("¡Estructuras vinculadas y datos cargados con éxito!\n");
        
=======
        LecturaArchivo repo = new LecturaArchivoImp();
        LogicaInscripciones servicio = new LogicaInscripcionesImp();
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("=== SISTEMA DE GESTIÓN DE INSCRIPCIONES ===");
        System.out.println("Cargando base de datos desde el archivo...");

         List<Inscripcion> listaInscripciones = repo.obtenerInscripciones();
        
        if (listaInscripciones == null || listaInscripciones.isEmpty()) {
            System.out.println("Error crítico: No se pudieron cargar datos. Saliendo del sistema.");
            teclado.close();
            return;
        }
        System.out.println("¡Datos cargados con éxito!\n");

>>>>>>> cdc977a74060fd6bfdfe7f4e0cbbe8c9fe461d98
        int opcion = 0;
        do {
            System.out.println("======================================================");
            System.out.println("                 MENÚ DE OPCIONES");
            System.out.println("======================================================");
<<<<<<< HEAD
            System.out.println("1. Mostrar todos los alquileres (Detalle completo)");
            System.out.println("2. Calcular recaudación total del hotel");
            System.out.println("3. Buscar alquiler por nombre del cliente");
            System.out.println("4. Contar cuántos servicios de SPA Premium se contrataron");
            System.out.println("5. Mostrar el alquiler más barato (Mínimo real)");
            System.out.println("6. Calcular promedio de noches en Alquileres Premium");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción (1-7): ");
            
            opcion = teclado.nextInt();
            System.out.println("------------------------------------------------------");
            
            switch (opcion) {
                case 1:
                    servicio.mostrarAlquileres(listaAlquileres);
                    break;
                case 2:
                    servicio.calcularRecaudacionTotal(listaAlquileres);
                    break;
                case 3:
                    teclado.nextLine(); 
                    System.out.print("Ingrese el nombre completo del cliente a buscar: ");
                    String nombreBusqueda = teclado.nextLine();
                    servicio.buscarAlquilerPorNombre(listaAlquileres, nombreBusqueda);
                    break;
                case 4:
                    servicio.cuantosServiciosSPAAlquileresPremium(listaAlquileres);
                    break;
                case 5:
                    servicio.mostrarAlquilerBarato(listaAlquileres);
                    break;
                case 6:
                    servicio.promedioNochesPasadasAlquileresPremium(listaAlquileres);
                    break;
                case 7:
                    System.out.println("Cerrando el sistema de gestión. ¡Éxitos en el examen!");
                    break;
                default:
                    System.out.println("Opción incorrecta. Por favor, intente del 1 al 7.");
                    break;
            }
            System.out.println(); 
            
        } while (opcion != 7);
        
        teclado.close();
=======
            System.out.println("1. Mostrar inscripciones (Nombre y Costo Final)");
            System.out.println("2. Buscar inscripción por código");
            System.out.println("3. Calcular recaudación total");
            System.out.println("4. Mostrar inscripción con mayor costo final");
            System.out.println("5. Contar cuántas inscripciones son Pase Libre");
            System.out.println("6. Socios con costo final mayor a $80000");
            System.out.println("7. Promedio de costo final de Inscripciones Iniciales");
            System.out.println("8. Mostrar nombres de socios en Mayúsculas");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción (1-9): ");
            
            opcion = teclado.nextInt();
            System.out.println("------------------------------------------------------");

            switch (opcion) {
                case 1:
                    servicio.mostrarInsNombreYCostoFinal(listaInscripciones);
                    break;
                case 2:
                    System.out.print("Ingrese el código de inscripción a buscar: ");
                    int codigoBusqueda = teclado.nextInt();
                    servicio.buscarInscripcion(listaInscripciones, codigoBusqueda);
                    break;
                case 3:
                    servicio.calcularRecaudacionTotal(listaInscripciones);
                    break;
                case 4:
                    servicio.mostrarInsMayorCostoFinal(listaInscripciones);
                    break;
                case 5:
                    servicio.mostrarCuantasInsPaseLibre(listaInscripciones);
                    break;
                case 6:
                    servicio.mostrarSociosCostoFinalMayor80000(listaInscripciones);
                    break;
                case 7:
                    servicio.calcularPromedioCostoFinalInsInicial(listaInscripciones);
                    break;
                case 8:
                    servicio.mostrarNombresMayus(listaInscripciones);
                    break;
                case 9:
                    System.out.println("Cerrando el sistema... ¡Muchas gracias!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            System.out.println(); 
        } while (opcion != 9);

       teclado.close();
>>>>>>> cdc977a74060fd6bfdfe7f4e0cbbe8c9fe461d98
    }
}