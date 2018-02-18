/**
 *  @author Sady
 */



// Clase de prueba COMPLETAR EL CÓDIGO DEL MÉTODO procesar Opción
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TestAlmacen2 {

	static public void main(String[] argv) {

		Almacen2 prueba = new Almacen2();
		Scanner sc = new Scanner(System.in);
		int opcion;

		mostrarMenu();
		opcion = sc.nextInt();
		while (opcion != 0) {
			procesarOpcion(opcion, prueba);
			mostrarMenu();
			opcion = sc.nextInt();
		}
		sc.close();
		
	}

	static void mostrarMenu() {
		System.out.println("--- MENÚ DE  CONTROL DEL ALMACÉN -----");
		System.out.println(" 1.- Mostrar contenido del Almacén");
		System.out.println(" 2.- Poner un Valor  ");
		System.out.println(" 3.- Buscar un Valor ");
		System.out.println(" 4.- Borrar un Valor");
		System.out.println(" 5.- Contar posiciones ocupadas.");
		System.out.println(" 6.- Contar posiciones libres.");
		System.out.println(" 0.- Terminar");
        System.out.print(" Introduzca una opción:[1-6]:");
	}

	// Procesa la opción introducida operando sobre el objeto Almacen1
	static void procesarOpcion(int opcion, Almacen2 parAlmacen) {
		// Completar......
		
		int valor;
		
		Scanner teclado=new Scanner(System.in);
		
		switch (opcion) {
		
		case 1:
			System.out.println(parAlmacen.toString());
			break;
			
		case 2:
			
			System.out.println("Introduzca un valor a insertar");
			
			if(!parAlmacen.ponValor(valor=teclado.nextInt())) {
				
				if(parAlmacen.estaLleno()) {
					
					System.out.println("El Almacen esta lleno");
				}
					System.out.println("No se ha podido introducir el valor");
				
			}
			else {System.out.println("El valor se ha introducido con exito");}
			
			break;
			
		case 3:
			
			System.out.println("Introduzca el valor a buscar");
			
			if(!parAlmacen.estaValor(valor=teclado.nextInt())) {
				
				System.out.println("No se encuentra el valor");
			}
			else {
				System.out.println("El valor se encuentra en la tabla");
			}
			break;
			
			
		case 4:
			System.out.println("Introduzca el valor a quitar");
				
				if(parAlmacen.sacarValor(valor=teclado.nextInt())) {
					
					System.out.println("El valor se ha quitado exitosamente");
					
				}
				else {
					
					if(!parAlmacen.estaValor(valor)) {
						
						System.out.println("El valor no se encuentra en la tabla");
					}
					
					System.out.println("El valor no se ha podido quitar");
					
				}
			break;
			
		
		case 5:
			System.out.println("Posiciones ocupadas = "+ parAlmacen.numPosicionesOcupadas());
			break;
		
		case 6:
			System.out.println(" Posiciones libres = " + parAlmacen.numPosicionesLibres());
			break;
		}

	}

}
