package uiMain;
import java.util.Scanner;
import paquete1.*;
import paquete2.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		byte control = 1;
		
		while(control != 0) {
		
			System.out.println("                     BIENVENIDO A MELORENTA\n");
			System.out.println("Por favor escribe el número de la opcion que desees seleccionar\n");
			System.out.println("1. Crear Inmueble");
			System.out.println("2. Visualizar Inmuebles creados");
			System.out.println("3. Visualizar Contratos");
			System.out.println("4. Visualizar Calendario (Notificaciones de Pago y Estado de Inmueble\n");
			
			byte seleccion = sc.nextByte();
			
			switch(seleccion) {
			
			case 1:{
				
				Inquilino inquilino = null;
				Contrato contrato = null;
				
				System.out.println("\nIngrese los siguientes datos, uno por uno, por favor\n");
				
				System.out.println("Numero de identificación de su inmueble:\n");
				double id = sc.nextDouble();
				
				System.out.println("\nDireccion de inmueble:\n");
				String direccion = sc.next();
				
				System.out.println("\nValor del arriendo de inmueble:\n");
				int canon = sc.nextInt();
				
				System.out.println("\nTamano del inmueble (Area de inmueble):\n");
				int tamano = sc.nextInt();
				
				System.out.println("\nNumero de habitaciones:\n");
				int numeroHabitaciones = sc.nextInt();
				
				System.out.println("\nNumero de banos:\n");
				int numeroBanos = sc.nextInt();
				
				System.out.println("\nTiene balcon? (Responder 'Si' o 'No'):\n");
				boolean balcon = false;
				String b = sc.next();
				if(b.equals("Si")) {
					balcon = true;
				}
				
				System.out.println("\nTiene patio? (Responder 'Si' o 'No'):\n");
				boolean patio = false;
				String p = sc.next();
				if(p.equals("Si")) {
					patio = true;
				}
				
				System.out.println("\nTiene cuarto util? (Responder 'Si' o 'No'):\n");
				boolean cuartoUtil = false;
				String c = sc.next();
				if(c.equals("Si")) {
					cuartoUtil = true;
				}
				
				System.out.println("\nCantidad de parqueaderos\n");
				int parqueadero = sc.nextInt();
				
				System.out.println("\nSu inmueble se encuentra en buen estado? (Responder 'Si' o 'No'):\n");
				boolean estadoFisicoInmueble = false;
				String e = sc.next();
				if(e.equals("Si")) {
					estadoFisicoInmueble = true;
				}
				
				System.out.println("\n El inmueble a registrar es un apartamento o una casa? "
						+ "(Responder 'Apartamento' o 'Casa'):\n");
				String inmueble = sc.next();
				
				if(inmueble.equals("Apartamento")) {
					
					Apartamento apartamento = null;
					
					System.out.println("\nEl inmueble a registrar está disponible? (Responder 'Si' o 'No'):\n");
					boolean estadoArriendoInmueble = true;
					String es = sc.next();
					if(es.equals("Si")) {
						estadoArriendoInmueble = false;
						
						System.out.println("\nNumero de Piso en el que se encuentra el Apartamento:\n");
						int numeroDePiso = sc.nextInt();
						
						apartamento = new Apartamento(id, direccion, canon, tamano, numeroHabitaciones, 
								numeroBanos, balcon, patio, cuartoUtil, parqueadero, estadoFisicoInmueble, 
								contrato, estadoArriendoInmueble, numeroDePiso);
						
						break;
					}
					
					break;
				}
				
				Casa casa = null;
				
				System.out.println("\nEl inmueble a registrar está disponible? (Responder 'Si' o 'No'):\n");
				boolean estadoArriendoInmueble = true;
				String es = sc.next();
				if(es.equals("Si")) {
					estadoArriendoInmueble = false;
					
					System.out.println("\nArea al aire libre:\n");
					int areaAireLibre = sc.nextInt();
					
					casa = new Casa(id, direccion, canon, tamano, numeroHabitaciones, numeroBanos, 
							balcon, patio, cuartoUtil, parqueadero, estadoFisicoInmueble, contrato, estadoArriendoInmueble, 
							areaAireLibre);
					
					break;
				}
				
				break;
			}
			
			case 2:{
				System.out.println("\nPor favor escriba el numero de la opcion que desee\n");
				System.out.println("1. Visualizar listado de inmuebles");
				System.out.println("2. Buscar un inmueble\n");
				byte opcion = sc.nextByte();
				if(opcion == 1) {
					System.out.println("Mostrar listado de inmuebles registrados y sus direcciones (?)\n");
					break;
				}
				System.out.println("Atributos de inmueble buscado (mostrarInmueble)");
				break;
			}
			
			case 3:{
				System.out.println("\nSe visualizan los contratos");
				break;
			}
			
			case 4:{
				System.out.println("\nMostrar fechas proximas de pago y estado de inmueble");
				break;
			}
			
			}
			
			System.out.println("\nDesea realizar otra operacion? (Responder 'Si' o 'No'):\n");
			String respuesta = sc.next();
			if(respuesta.equals("No")) {
				control = 0;
			}
		
		}
		
		System.out.println("\nMuchas gracias por ser parte de MeloRenta!!!\n");
		System.out.println("Que tengas un excelente dia!!!");

	}

}
