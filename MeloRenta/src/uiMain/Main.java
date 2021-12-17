package uiMain;
import java.util.*;
import baseDatos.*;
import java.time.LocalDate;
import gestorAplicacion_Inmuebles.*;
import gestorAplicacion_contratos.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Lector.Leer();
		byte control = 1;
		
		while(control != 0) {
		
			System.out.println("                     BIENVENIDO A MELORENTA\n");
			System.out.println("Por favor escribe el número de la opcion que desees seleccionar\n");
			System.out.println("1. Crear Inmueble");
			System.out.println("2. Visualizar Inmuebles creados");
			System.out.println("3. Visualizar Contratos");
			System.out.println("4. Visualizar Calendario (Notificaciones de Pago y Estado de Inmueble)");
			System.out.println("0. Si desea finalizar el programa\n");
			
			byte seleccion = sc.nextByte();
			
			switch(seleccion) {
			case 0:{
				control=0;
				break;
			}
			case 1:{
				
				Inquilino inquilino = null;
				Contrato contrato = null;
				
				System.out.println("\nIngrese los siguientes datos, uno por uno, por favor\n");
				
				System.out.println("Numero de identificación de su inmueble:\n");
				double idInmueble = sc.nextDouble();
				
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
				if(b.equalsIgnoreCase("si")) {
					balcon = true;
				}
				
				System.out.println("\nTiene patio? (Responder 'Si' o 'No'):\n");
				boolean patio = false;
				String p = sc.next();
				if(p.equalsIgnoreCase("si")) {
					patio = true;
				}
				
				System.out.println("\nTiene cuarto util? (Responder 'Si' o 'No'):\n");
				boolean cuartoUtil = false;
				String c = sc.next();
				if(c.equalsIgnoreCase("si")) {
					cuartoUtil = true;
				}
				
				System.out.println("\nCantidad de parqueaderos\n");
				int parqueadero = sc.nextInt();
				
				System.out.println("\nSu inmueble se encuentra en buen estado? (Responder 'Si' o 'No'):\n");
				boolean estadoFisicoInmueble = false;
				String e = sc.next();
				if(e.equalsIgnoreCase("si")) {
					estadoFisicoInmueble = true;
				}
				
				System.out.println("\n El inmueble a registrar es un apartamento o una casa? "
						+ "(Responder 'Apartamento' o 'Casa'):\n");
				String inmueble = sc.next();
				
				if(inmueble.equalsIgnoreCase("apartamento")) {
					
					Apartamento apartamento = null;
					
					System.out.println("\nNumero de Piso en el que se encuentra el Apartamento:\n");
					int numeroDePiso = sc.nextInt();
					
					System.out.println("\nEl inmueble a registrar está disponible? (Responder 'Si' o 'No'):\n");
					boolean estadoArriendoInmueble = true;
					String es = sc.next();
					if(es.equalsIgnoreCase("si")) {
						estadoArriendoInmueble = false;
						
						apartamento = new Apartamento(idInmueble, direccion, canon, tamano, numeroHabitaciones, 
								numeroBanos, balcon, patio, cuartoUtil, parqueadero, estadoFisicoInmueble, 
								contrato, estadoArriendoInmueble, numeroDePiso);
						
						System.out.println("Apartamento registrado exitosamente");
						
						break;
					}
					
					apartamento = new Apartamento(idInmueble, direccion, canon, tamano, numeroHabitaciones, 
							numeroBanos, balcon, patio, cuartoUtil, parqueadero, estadoFisicoInmueble, 
							contrato, estadoArriendoInmueble, numeroDePiso);
					
					System.out.println("\nRegistre los datos del inquilino al que arrendo el apartamento\n");
					System.out.println("Documento de identidad del inquilino:\n");
					String idInquilino = sc.next();
					
					System.out.println("\nNombre completo del inquilino:\n");
					String nombreInquilino = sc.next();
					
					System.out.println("\nGenero del inquilino:\n");
					String genero = sc.next();
					
					System.out.println("\nFecha de nacimiento del inquilino (En formato 'dd/mm/yyyy'):\n");
					String f = sc.next();
					LocalDate fecha = LocalDate.parse(f);
					
					System.out.println("\nNumero de telefono del inquilino:\n");
					String telefono = sc.next();
					
					System.out.println("\nCorreo electronico del inquilino:\n");
					String correo = sc.next();
					
					inquilino = new Inquilino(idInquilino, nombreInquilino, genero, fecha, telefono, 
							correo, contrato);
					
					System.out.println("\nEspecifique, con los siguientes datos, el contrato con el "
							+ "inquilino actual");
					System.out.println("\nNumero de identificacion del contrato");
					double idContrato = sc.nextDouble();
					
					System.out.println("\nFecha de inicio de contrato (dd/mm/yy):\n");
					String fInicio = sc.next();
					LocalDate fechaInicio = LocalDate.parse(fInicio);
					
					System.out.println("\nFecha de finalización de contrato (dd/mm/yy):\n");
					String fFin = sc.next();
					LocalDate fechaFin = LocalDate.parse(fFin);
					
					contrato = new Contrato(idContrato, null, fechaInicio, fechaFin, apartamento, 
							inquilino, true);					
					contrato.getInquilino().setContrato(contrato);
					apartamento.setContrato(contrato);
					
					System.out.println("\nApartamento con su debido contrato registrado exitosamente\n");
					
					break;
				}
				
				Casa casa = null;
				
				System.out.println("\nEl inmueble a registrar está disponible? (Responder 'Si' o 'No'):\n");
				boolean estadoArriendoInmueble = true;
				String es = sc.next();
				
				System.out.println("\nArea al aire libre:\n");
				int areaAireLibre = sc.nextInt();
				
				if(es.equalsIgnoreCase("si")) {
					estadoArriendoInmueble = false;
					
					casa = new Casa(idInmueble, direccion, canon, tamano, numeroHabitaciones, numeroBanos, 
							balcon, patio, cuartoUtil, parqueadero, estadoFisicoInmueble, contrato, estadoArriendoInmueble, 
							areaAireLibre);
					System.out.println("\nCasa registrada exitosamente\n");
					break;
				}
				
				casa = new Casa(idInmueble, direccion, canon, tamano, numeroHabitaciones, numeroBanos, 
						balcon, patio, cuartoUtil, parqueadero, estadoFisicoInmueble, contrato, 
						estadoArriendoInmueble, areaAireLibre);
				
				System.out.println("\nRegistre los datos del inquilino al que arrendo la casa\n");
				System.out.println("Documento de identidad del inquilino:\n");
				String idInquilino = sc.next();
				
				System.out.println("\nNombre completo del inquilino:\n");
				String nombreInquilino = sc.next();
				
				System.out.println("\nGenero del inquilino:\n");
				String genero = sc.next();
				
				System.out.println("\nFecha de nacimiento del inquilino (En formato 'dd/mm/yyyy'):\n");
				String f = sc.next();
				LocalDate fecha = LocalDate.parse(f);
				
				System.out.println("\nNumero de telefono del inquilino:\n");
				String telefono = sc.next();
				
				System.out.println("\nCorreo electronico del inquilino:\n");
				String correo = sc.next();
				
				inquilino = new Inquilino(idInquilino, nombreInquilino, genero, fecha, telefono, 
						correo, contrato);
				
				System.out.println("\nEspecifique, con los siguientes datos, el contrato con el "
						+ "inquilino actual");
				System.out.println("\nNumero de identificacion del contrato");
				double idContrato = sc.nextDouble();
				
				System.out.println("\nFecha de inicio de contrato (dd/mm/yy):\n");
				String fInicio = sc.next();
				LocalDate fechaInicio = LocalDate.parse(fInicio);
				
				System.out.println("\nFecha de finalización de contrato (dd/mm/yy):\n");
				String fFin = sc.next();
				LocalDate fechaFin = LocalDate.parse(fFin);
				
				contrato = new Contrato(idContrato, null, fechaInicio, fechaFin, casa, inquilino, true);					
				contrato.getInquilino().setContrato(contrato);
				casa.setContrato(contrato);
				
				System.out.println("\nApartamento con su debido contrato registrado exitosamente\n");
				
				break;
			}
			
			case 2:{
				System.out.println("\nPor favor escriba el numero de la opcion que desee\n");
				System.out.println("1. Visualizar listado de inmuebles");
				System.out.println("2. Buscar un inmueble\n");
				byte opcion = sc.nextByte();
				if(opcion == 1) {
					System.out.println("\nDesea buscar casas o apartamentos?:\n");
					String inmueble = sc.next();
					if(inmueble.equalsIgnoreCase("casas")) {
						short cont = 1;
						for(Casa casa : Casa.getListado()) {
							System.out.println("Casa " + cont + ".\nDireccion: " + casa.getDireccion());
						}
						
						break;
					}
					
					short cont = 1;
					for(Apartamento apartamento : Apartamento.getListado()) {
						System.out.println("Apartamento " + cont + ".\nDireccion: " + apartamento.getDireccion());
					}
					
					break;
				}
				
				System.out.println("\nIngrese el numero de identificacion del inmueble\n");
				double id = sc.nextDouble();
				System.out.println("\nEs una casa o un apartamento?:\n");
				String inmueble = sc.next();
				boolean encontrado = false;
				if(inmueble.equalsIgnoreCase("casa")) {
					for(Casa casa : Casa.getListado()) {
						if(casa.getId() == id) {
							encontrado = true;
							
							System.out.println(casa.mostrarInmueble());
							break;
						}
					}
					if(!encontrado) {
						System.out.println("Casa no registrada con numero de identificacion " + id);
						break;
					}
					
					break;
				}
				
				for(Apartamento apartamento : Apartamento.getListado()) {
					if(apartamento.getId() == id) {
						encontrado = true;
						System.out.println(apartamento.mostrarInmueble());
						break;
					}
				}
				
				if(!encontrado) {
					System.out.println("Apartamento no registrada con numero de identificacion " + id);
					break;
				}
				
				break;
			}
			
			case 3:{
				System.out.println("\n¿El inmueble que va a buscar es una casa o un apartamento?");
				String respuestacasa = sc.next();
				if (respuestacasa.equalsIgnoreCase("Apartamento")) {
					System.out.println("\nEscriba el Id del Apartamento sobre el que quiere ver el historial de contratos ");
					int idrequeridoapto= sc.nextInt();
					for (Inmueble inmueble : Apartamento.getListado()) {
						if (inmueble.getId()==idrequeridoapto) {
							System.out.println(inmueble.historialContratos());
							break;
						}
					}
					System.out.println("No se encontró un apartamento con el id ingresado");
					break;
				}
				if (respuestacasa.equalsIgnoreCase("Casa")) {
					System.out.println("\nEscriba el Id de la Casa sobre el que quiere ver el historial de contratos ");
					int idrequeridocasa= sc.nextInt();
					for (Inmueble inmueble : Casa.getListado()) {
						if (inmueble.getId()==idrequeridocasa) {
							System.out.println(inmueble.historialContratos());
							break;
						}
					}
					System.out.println("No se encontró una casa con el id ingresado");
					break;
				}
				
				
			}
			
			case 4:{
				System.out.println("\nMostrar fechas proximas de pago y estado de inmueble");
				break;
			}
			
			}
			if (control==1) {
				System.out.println("\nDesea realizar otra operacion? (Responder 'Si' o 'No'):\n");
				String respuesta = sc.next();
				if(respuesta.equals("No")) {
					control = 0;
				}
			}
		
			
		
		}
		
		System.out.println("\nMuchas gracias por ser parte de MeloRenta!!!\n");
		System.out.println("Que tengas un excelente dia!!!");

	}

}
