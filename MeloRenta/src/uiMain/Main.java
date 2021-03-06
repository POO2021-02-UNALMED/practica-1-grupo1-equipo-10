package uiMain;
import java.util.*;
import baseDatos.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import gestorAplicacion_Inmuebles.*;
import gestorAplicacion_contratos.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Lector.Leer();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("                     BIENVENIDO A MELORENTA");

		byte control = 1;
		
		while(control != 0) {
		
			System.out.println("\n                        MENU PRINCIPAL\n");
			System.out.println("Por favor escribe el número de la opcion que desees seleccionar\n");
			System.out.println("1. Crear Inmueble");
			System.out.println("2. Visualizar Inmuebles creados");
			System.out.println("3. Visualizar Contratos");
			System.out.println("4. Visualizar Calendario (Notificaciones de Pago y Estado de Inmueble)");
			System.out.println("0. Si desea finalizar el programa\n");
			
			byte seleccion = sc.nextByte();
			
			switch(seleccion) {
			case 0:{
				control = 0;
				break;
			}
			case 1:{
				
				Inquilino inquilino = null;
				Contrato contrato = null;
				Factura factura = null;
				
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
				
				System.out.println("\nEl inmueble a registrar es un apartamento o una casa? "
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
					Apartamento.adicionarApartamento(apartamento);
					
					System.out.println("\nRegistre los datos del inquilino al que arrendo el apartamento\n");
					System.out.println("Documento de identidad del inquilino:\n");
					String idInquilino = sc.next();
					
					System.out.println("\nNombre completo del inquilino:\n");
					String nombreInquilino = sc.next();
					
					System.out.println("\nGenero del inquilino:\n");
					String genero = sc.next();
					
					System.out.println("\nFecha de nacimiento del inquilino (En formato 'dd/mm/yyyy'):\n");
					String f = sc.next();
					LocalDate fecha = LocalDate.parse(f,formatter);
					
					System.out.println("\nNumero de telefono del inquilino:\n");
					String telefono = sc.next();
					
					System.out.println("\nCorreo electronico del inquilino:\n");
					String correo = sc.next();
					
					inquilino = new Inquilino(idInquilino, nombreInquilino, genero, fecha, telefono, 
							correo, contrato);
					//Inquilino.adicionarInquilino(inquilino);
					
					System.out.println("\nEspecifique, con los siguientes datos, el contrato con el "
							+ "inquilino actual");
					System.out.println("\nNumero de identificacion del contrato");
					double idContrato = sc.nextDouble();
					
					System.out.println("\nIngrese la clausula del contrato:\n");
					String clausulac = sc.next();
					
					System.out.println("\nFecha de inicio de contrato (dd/mm/yy):\n");
					String fInicio = sc.next();
					LocalDate fechaInicio = LocalDate.parse(fInicio,formatter);
					
					System.out.println("\nFecha de finalización de contrato (dd/mm/yy):\n");
					String fFin = sc.next();
					LocalDate fechaFin = LocalDate.parse(fFin,formatter);
					
					contrato = new Contrato(idContrato, clausulac, fechaInicio, fechaFin, apartamento, 
							inquilino, true);
					contrato.getInquilino().setContrato(contrato);
					apartamento.setContrato(contrato);
					factura = new Factura(idContrato, false, contrato);
					
					System.out.println("\nApartamento con su debido contrato registrado exitosamente\n");
					
					break;
				}
				
				Casa casa = null;
				
				System.out.println("\nEl inmueble a registrar está disponible? (Responder 'Si' o 'No'):\n");
				boolean estadoArriendoInmueble = true;
				String es = sc.next();
				
				System.out.println("\nArea al aire libre: (En metros cuadrados)\n");
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
				LocalDate fecha = LocalDate.parse(f,formatter);
				
				System.out.println("\nNumero de telefono del inquilino:\n");
				String telefono = sc.next();
				
				System.out.println("\nCorreo electronico del inquilino:\n");
				String correo = sc.next();
				
				inquilino = new Inquilino(idInquilino, nombreInquilino, genero, fecha, telefono, 
						correo, contrato);
				//Inquilino.adicionarInquilino(inquilino);
				
				System.out.println("\nEspecifique, con los siguientes datos, el contrato con el "
						+ "inquilino actual");
				System.out.println("\nNumero de identificacion del contrato");
				double idContrato = sc.nextDouble();
				
				System.out.println("\nIngrese la clausula del contrato:\n");
				String clausulac = sc.next();
				
				System.out.println("\nFecha de inicio de contrato (dd/mm/yy):\n");
				String fInicio = sc.next();
				LocalDate fechaInicio = LocalDate.parse(fInicio,formatter);
				
				System.out.println("\nFecha de finalización de contrato (dd/mm/yy):\n");
				String fFin = sc.next();
				LocalDate fechaFin = LocalDate.parse(fFin,formatter);
				
				contrato = new Contrato(idContrato, clausulac, fechaInicio, fechaFin, casa, inquilino, true);
				contrato.getInquilino().setContrato(contrato);
				casa.setContrato(contrato);
				factura = new Factura(idContrato, false, contrato);
				
				System.out.println("\nCasa con su debido contrato registrado exitosamente\n");
				
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
						for(Casa casa : Casa.getCasas()) {
							System.out.println("Casa " + cont + ".\tDireccion: " + casa.getDireccion());
						}
						
						break;
					}
					
					short cont = 1;
					for(Apartamento apartamento : Apartamento.getApartamentos()) {
						System.out.println("Apartamento " + cont + ".\tDireccion: " + apartamento.getDireccion());
					}
					
					break;
				}
				
				System.out.println("\nIngrese el numero de identificacion del inmueble\n");
				double id = sc.nextDouble();
				System.out.println("\nEs una casa o un apartamento?:\n");
				String inmueble = sc.next();
				boolean encontrado = false;
				if(inmueble.equalsIgnoreCase("casa")) {
					for(Casa casa : Casa.getCasas()) {
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
				
				for(Apartamento apartamento : Apartamento.getApartamentos()) {
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
				System.out.println("\nEl inmueble que va a buscar es una casa o un apartamento?");
				String respuesta = sc.next();
				boolean encontrado = false;
				if (respuesta.equalsIgnoreCase("apartamento")) {
					System.out.println("\nEscriba el Id del Apartamento sobre el que quiere ver el "
							+ "historial de contratos ");
					int idRequeridoApto= sc.nextInt();
					for (Apartamento inmueble : Apartamento.getApartamentos()) {
						if (inmueble.getId() == idRequeridoApto) {
							encontrado = true;
							System.out.println(inmueble.historialContratos());
							break;
						}
					}
					
					if(!encontrado) {
						System.out.println("No se encontró un apartamento con el id ingresado");
						break;
					}
					
					break;
				}
				
				System.out.println("\nEscriba el Id de la Casa sobre el que quiere ver el historial de "
						+ "contratos ");
				int idRequeridoCasa= sc.nextInt();
				for (Casa inmueble : Casa.getCasas()) {
					if (inmueble.getId() == idRequeridoCasa) {
						encontrado = true;
						System.out.println(inmueble.historialContratos());
						break;
					}
				}
				
				if(!encontrado) {
					System.out.println("No se encontró una casa con el id ingresado");
					break;
				}				
				
			}
			
			case 4:{
				
				System.out.println("\nIngrese el numero de identificacion del contrato al que se le "
						+ "revisará el calendario de pago\n");
				double id = sc.nextDouble();
				boolean contador = false;
				for(Factura factura : Factura.getFacturas()) {
					
					if(factura.getId() == id) {
						
						contador = true;
						
						System.out.println("\nDisponibilidad del inmueble relacionado con el contrato:\n");
						System.out.println(factura.getContrato().getInmueble().consultarEstado());
						
						System.out.println("\nFechas de pago del contrato:\n");
						for(LocalDate fecha : factura.calendario_pago()) {
							System.out.println(fecha);
						}
						
					}
				}
				
				if(!contador) {
					System.out.println("\nNo se encontró ninguna factura relacionada con el contrato\n");
					break;
				}
				
				break;
			}
			
			}
			if (control==1) {
				System.out.println("\nDesea volver al menu principal? (Responder 'Si' o 'No'):\n");
				String respuesta = sc.next();
				if(respuesta.equalsIgnoreCase("no")) {
					control = 0;
				}
			}
		
			
		
		}
		Escritor.Escribir();
		System.out.println("\nMuchas gracias por ser parte de MeloRenta!!!\n");
		System.out.println("Que tengas un excelente dia!!!");

	}

}
